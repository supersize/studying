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
    int size;
    Node<T> head;

    // add, addFirst, addLast
    public void add (T value) {
        Node newNode = new Node<>(value);
        if(head == null) {
            head = newNode;
        }
        else {
            Node<T> current = head;
            while(current.next != null)
                current = current.next;
            current.next = newNode;
        }
        size++;
    }

    // add
    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int size(){ return size;}

    public Node get(T value ) {
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if(current.value == value ) {
                current = current.next;
            } else { return current; }
        }
        return null;
    }

    public boolean remove(T value) {
         Node<T> target = get(value);
        if(target == null)  return false;

        // remove first
        if (head.value.equals(value)) {
            head = head.next;
            size--;
        }

        Node<T> prev = head;
        while (prev.next != null) {
            if(prev.next.value.equals(value)) {
                prev.next = prev.next.next;
                size--;
            }
            else {prev = prev.next;}
        }

        return true;
    }

    public void clear() {
        head = null;
        size = 0;
    }


}
