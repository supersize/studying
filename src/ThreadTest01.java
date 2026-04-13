/**
 * packageName    : PACKAGE_NAME
 * author         : kimjaehyeong
 * date           : 4/13/26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 4/13/26        kimjaehyeong       created
 */
public class ThreadTest01 implements Runnable {
    private String workerName;

    ThreadTest01(String workerName) {
        this.workerName = workerName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(workerName +" is working! :" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("completed!");
    }
}
