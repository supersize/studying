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
public class Entry<K, V> {
    K key;
    V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
