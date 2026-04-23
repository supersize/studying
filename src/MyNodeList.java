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
public class MyNodeList<T> {
//    private int size;
//    private Node<T> head;
//
//    public void add(T value){
//        Node<T> newNode = new Node<>(value);
//        if(head == null) {
//            head = newNode;
//        }
//        else {
//            Node<T> currnet = head;
//            while(currnet.next != null) {
//                currnet = currnet.next;
//            }
//            currnet.next = newNode;
//        }
//        size++;
//    }


    private int size;
    private Node<T> head;

    public void add (T value) {
        Node newNode = new Node<>(value);
        if(head == null) {
            head = newNode;
        }
        else {
            Node current = head;
            while(head != null) {
                current = current.next;
            }

            current.next = newNode;
        }
        size++;
    }

}
