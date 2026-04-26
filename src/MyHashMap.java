import org.w3c.dom.html.HTMLImageElement;

import java.util.Map;

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
//    private arrListTest<Entry<K, V>>[] buckets;
//    private int capasity;
//    private int size;
//
//
//    public MyHashMap(arrListTest<Entry<K, V>> buckets, int capasity, int size) {
//        this.capasity = 16;
//        this.size = 0;
//        this.buckets = new arrListTest[capasity];
//        for(int i = 0; i < this.buckets.length; i++) {
//            this.buckets[i] = new arrListTest<>();
//        }
//    }
//
//    private int hash(K key) {
//        return Math.abs(key.hashCode()) % capasity;
//    }
//
//    public void put(K key, V value){
//        int idx = hash(key);
//
//        arrListTest<Entry<K, V>> bucket = buckets[idx];
//        for(int i = 0; i < bucket.getSize(); i++){
//            Entry<K, V> entry = bucket.get(i);
//            if(entry.key.equals(key)) {
//                entry.value = value;
//                return;
//            }
//        }
//        bucket.add(new Entry<K, V>(key, value));
//        size++;
//    }
//
//
//    public V get (K key) {
//        int idx = hash(key);
//
//        arrListTest<Entry<K, V>> bucket = buckets[idx];
//        for(int i = 0; i < bucket.getSize(); i++) {
//            Entry<K, V> target = bucket.get(i);
//            if(target.key.equals(key)) return target.value;
//        }
//        return null;
//    }
//
//    public void remove(K key) {
//        int idx = hash(key);
//
//        arrListTest<Entry<K, V>> bucket = buckets[idx];
//        for(int i = 0; i < bucket.getSize(); i++) {
//            Entry<K, V> target = bucket.get(i);
//            if(target.key.equals(key)) {
//                bucket.removeIdxForSet(i);
//            }
//        }
//        size--;
//    }
}
