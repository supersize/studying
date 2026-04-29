/**
 * packageName    : PACKAGE_NAME
 * author         : kimjaehyeong
 * date           : 4/28/26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/28/26        kimjaehyeong       created
 */
public class MyNodeForBinary<T> {
    T value;
    MyNodeForBinary left;
    MyNodeForBinary right;

    public MyNodeForBinary(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
