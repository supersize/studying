import org.w3c.dom.html.HTMLImageElement;

import java.security.Key;

/**
 * packageName    : PACKAGE_NAME
 * author         : kimjaehyeong
 * date           : 4/23/26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/23/26        kimjaehyeong       created
 */
public class MyHashSet<T> {
    private arrListTest<T>[] buckets;
    private int capacity = 16;
    private int size = 0;

    public MyHashSet() {
        buckets = new arrListTest[capacity];
        /*
            buckets = new arrListTest[capacity];는 16개의 new arrListTest객체를 만든개 아니라
            arrListTest 객체가 들어올 자리를 만든거다. 즉, arrListTest를 참조할 자리 16개를 만들거라고 볼수 있다.
            그래서 for문으로 각 자리마다 arrListTest 넣어 줘야함
         */
        for(int i = 0; i < capacity; i++) {
            buckets[i] = new arrListTest<>();
        }
    }

    private int hash(T value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public void add (T value) {
        int index = hash(value);
        arrListTest<T> arrListTest = buckets[index];
        if(!arrListTest.contains(value)) {
            arrListTest.add(value);
            size++;
        }
    }

    public boolean contains(T value) {
        int index = hash(value);
        return buckets[index].contains(value);
    }

    public void remove(T value) {
        int idx = hash(value);
        arrListTest<T> target = buckets[idx];
        if(buckets[idx].contains(value)) {
            target.removeIdxForSet(idx, size);
            size--;
        }
    }
}
