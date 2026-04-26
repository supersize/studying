import org.w3c.dom.html.HTMLImageElement;

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
public class MyHashMap<K, V> {
    private arrListTest<Entry<K, V>>[] buckets;
    private int capacity;
    private int size;

    public MyHashMap() {
        this.capacity = 16;
        this.size = 0;
        this.buckets = new arrListTest[capacity];

        for(int i = 0; i < buckets.length; i++) {
            buckets[i] = new arrListTest<>();
        }
    }

    // hash, put, remove, get,
    private int hash (K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void put (K key, V value) {
        int idx = hash(key);

        arrListTest<Entry<K, V>> bucket = buckets[idx];
        for(int i = 0; i < bucket.getSize(); i++) {
            Entry<K, V> target = bucket.get(i);
            if(target.key.equals(key))
                target.value = value;
            return;
        }

        bucket.add(new Entry<K, V>(key, value));
        size++;
    }

    public V getValue (K key) {
        int idx = hash(key);

        arrListTest<Entry<K, V>> bucket = buckets[idx];
        for (int i = 0; i < bucket.getSize(); i++) {
            Entry<K, V> target = bucket.get(i);
            if(target.key.equals(key))
                return target.value;
        }

        return null;
    }

    public boolean remove(K key) {
        int idx = hash(key);

        arrListTest<Entry<K, V>> bucket = buckets[idx];
        for(int i = 0; i < bucket.getSize(); i++) {
            if(bucket.get(i).key.equals(key)) {
                bucket.removeIdxForSet(i);
                size--;
                return true;
            }
        }

        return false;
    }

    public int size () { return size;}

    public boolean containsKey (K key) {
        int idx = hash(key);

        arrListTest<Entry<K, V>> bucket= buckets[idx];
        for (int i = 0; i < bucket.getSize(); i++)
            if(bucket.get(i).key.equals(key)) return true;

        return false;
    }
}
