import org.w3c.dom.html.HTMLImageElement;

import java.lang.reflect.TypeVariable;
import java.util.Objects;
import java.util.Vector;

/**
 * packageName    : PACKAGE_NAME
 * author         : kimjaehyeong
 * date           : 4/26/26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/26/26        kimjaehyeong       created
 */
public class MyQueue<T> {
    private Object[] objects;
    private int size;
    private int front;
    private int rear;
    private int capacity;

    public MyQueue() {
        this.objects = new Objects[10];
        this.size = 0;
        this.capacity = 10;
    }

    public void enqueue (T value) {
        if(size == objects.length) resize();

        objects[rear] = value;
        rear = (rear + 1) % capacity; // pop되는 순서는 idx가 아니라 rear다
        size++;
    }

    public T dequeue (T value) {
        if(isEmpty()) throw new RuntimeException("Queue is null");

        T result = (T) objects[front];
        objects[front] = null;
        front = (front + 1) % capacity;
        size--;
        return result;
    }

    public T peek () {
        if(isEmpty()) throw new RuntimeException("Queue is null");
        return (T) objects[front];
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    private void resize(){
        int targetCapacity = capacity * 2;
        Object[] newObj = new Objects[targetCapacity];
        for(int i = 0; i < size; i++)
            newObj[i] = objects[(front + i) % capacity]; // 기존 값들을 모두 땡겨서 새 배열에는 앞에서부터 집어넣음

        objects = newObj;
        capacity = targetCapacity;
        front = 0;
        rear = size;
    }

}
