import java.util.Objects;

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
public class MyStack<T> {
    private Object[] objects;
    private int size;
    private int capacity = 10;

    public MyStack() {
        this.objects = new Object[capacity];
        this.size = 0;
    }

    // push, pop, peek, isEmpty, size, resize
    public void push (T value) {
        if (size == capacity) resize();

        objects[size++] = value;
    }

    public T pop (T value) {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        value = (T)objects[--size];
        objects[size] = null;

        return value;
    }

    public T peek () {
        if(isEmpty()) throw new RuntimeException("Stack is empty");

        return (T) objects[size - 1];
    }

    private boolean isEmpty (){
        return size == 0 ?  true : false;
    }


    private void resize() {
        capacity *= 2;
        Object[] newObject = new Object[capacity];
        for (int i = 0; i < objects.length; i++) {
            newObject[i] = objects[i];
        }
        objects = newObject;
    }


}
