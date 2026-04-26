public class ListNode<T> {
    private Node<T> head;
    private int size;

    public ListNode() {
        this.size = 0;
    }

    // add
    public void add (T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        }
        else {
            Node<T> current = head;
            while (head.next != null) {
                current.next = current;
            }

            current.next = newNode;
        }

        size++;
    }
}