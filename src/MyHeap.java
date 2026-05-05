/**
 * packageName    : PACKAGE_NAME
 * author         : kimjaehyeong
 * date           : 5/5/26
 * description    :
 * 힙은 최소값/최대값 구할때 사용한다, 왼쪽 노드기준으르 마지막줄 제외하고 그 위에 덩어리 가르킴
 * 최소값: 부모 <= 자식
 * 최대값: 부모 >= 자식
 * BST와 다른점
 *  BST: 왼쪽 < 부모 < 오른쪽, 중복 불허용
 *  힙: 최대/최소값만 구함, 중복 허용
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 5/5/26        kimjaehyeong       created
 */
public class MyHeap {
    private int[] heap;
    private int size;

    public MyHeap(int capacity) {
        this.heap = new int[capacity];
        this.size = 0;
    }

    public void insert (int val) {
        heap[size] = val;
        int current = size;
        size++;

        while(current > 0) {
            int parent = (current - 1) / 2;
            if(heap[parent] <= heap[current]) break; // 최소값
//            if(heap[parent] >= heap[current]) break; // 최대값

            swap(parent, current);
            current = parent;
        }
    }


    private void swap(int parent, int current){
        int temp = heap[parent];
        heap[parent] = heap[current];
        heap[current] = temp;
    }

    public void printHeap () {
        int level = 0;
        int index = 0;

        while (index < size) {
            int count = (int) Math.pow(2, level);

            for (int i = 0; i < count && index < size; i++) {
                System.out.print(heap[index++] + " ");
            }
            System.out.println();
            level++;
        }
    }


    public int remove() {
        if(size == 0) throw new RuntimeException("Empty heap");

        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;

        int current = 0;
        /*
         제일 중요한거
         왼쪽 노드 2 * current + 1
         오른쪽 노드 2 * current + 2
         */
        while (true) {
            int left = 2 * current + 1;
            int right = 2 * current + 2;
            int smallest = current;

            if(left < size && heap[left] < heap[smallest])
                smallest = left;

            if(right < size && heap[right] < heap[smallest])
                smallest = right;

            if(smallest == current) break;

            swap(current, smallest);
            current = smallest;
        }

        return root;
    }
}
