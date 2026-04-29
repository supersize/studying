import java.util.LinkedList;
import java.util.Queue;

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
public class MyBinaryTree<T> {
    MyNodeForBinary<T> root;

    public MyBinaryTree() {
        this.root = null;
    }

    // preorder
    public void preorder (MyNodeForBinary<T> node) {
        if(node == null) return;

        System.out.println(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder (MyNodeForBinary<T> root) {
        if(root == null) return;

        inorder(root.left);
        System.out.println(root.value + " ");
        inorder(root.right);
    }

    public void postorder (MyNodeForBinary<T> root) {
        if(root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.value + " ");
    }


    public void levelOrder (MyNodeForBinary<T> root) {
        if(root == null) return;

        Queue<MyNodeForBinary<T>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            MyNodeForBinary current = queue.poll();

            System.out.println(current.value + " ");
            if(current.left != null)
                queue.offer(current.left);

            if(current.right != null)
                queue.offer(current.right);

        }
    }



}
