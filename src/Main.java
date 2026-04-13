import java.util.*;

public class Main {
    public static void main(String[] args) {
        ThreadTest01 test01 = new ThreadTest01("worker01");
        ThreadTest01 test02 = new ThreadTest01("worker02");

        Thread thread01 = new Thread(test01);
        Thread thread02 = new Thread(test02);


        thread01.start();
        thread02.start();
//        thread01.run();
//        thread02.run();
    }



}