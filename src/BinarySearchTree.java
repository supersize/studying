import org.w3c.dom.html.HTMLImageElement;

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
public class BinarySearchTree<T extends Comparable<T>> {

    MyNodeForBinary<T> root;

    // left < root < right
    public MyNodeForBinary insert(MyNodeForBinary<T> node, T value) {
        if(node == null) return new MyNodeForBinary<>(value);

        if(value.compareTo(root.value) < 0){
            root.left = insert(node.left, value);
        }
        else if(value.compareTo(root.value) > 0)
            root.right = insert(node.right, value);

        return node;
    }

    public boolean search (MyNodeForBinary<T> node, T value){
        if(node == null ) return false;
        if(node.value.equals(value)) return true;

        if(value.compareTo(node.value) < 0)
            return search(node.left, value);

        return search(node.right, value);
    }

    public MyNodeForBinary<T> delete (MyNodeForBinary<T> node, T value) {
        if(node == null) return null;
        if(value.compareTo(node.value) < 0) {
            node.left = delete(node.left, value);
        }
        else if (value.compareTo(node.value) > 0) {
            node.right = delete(node.right, value);
        }
        else {
            if (node.left == null) return node.right;
            else if (node.right == null) return node.left;

            MyNodeForBinary<T> minNode = findMin(node.right);
            node.value = minNode.value;

            node.right = delete(node.right, minNode.value);
        }

        return root;
    }


    private MyNodeForBinary<T> findMin (MyNodeForBinary<T> node) {
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }
}
