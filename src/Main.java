import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ThreadTest01 test01 = new ThreadTest01("worker01");
//        ThreadTest01 test02 = new ThreadTest01("worker02");
//
//        Thread thread01 = new Thread(test01);
//        Thread thread02 = new Thread(test02);


//        thread01.start();
//        thread02.start();
//        thread01.run();
//        thread02.run();

        arrListTest<String> test = new arrListTest<>();


        System.out.println("add value");
        arrListTest<Integer> arrListTest = new arrListTest<>();
        for(int i = 0; i < 12; i++){
            arrListTest.add(i);
            System.out.println("size! : " + arrListTest.getSize());
        }
        System.out.println("add value size!! : " + arrListTest.getSize());

        // removeIdx
        System.out.println("remove idx");
        arrListTest.removeIdxForSet(11);
        System.out.println("size!!! : " + arrListTest.get(10));
        for(int i = 0; i < arrListTest.getSize(); i++){
            System.out.println("size! : " + arrListTest.get(i));
        }
        System.out.println("remove idx size : " + arrListTest.getSize());

        // remove value
        System.out.println("remove value");
        arrListTest.removeValue(3);
        for(int i = 0; i < arrListTest.getSize(); i++){
            System.out.println("size! : " + arrListTest.get(i));
        }
        System.out.println("remove value size : " + arrListTest.getSize());

        System.out.println("contains : " + arrListTest.contains(4));

        System.out.println("set");
        arrListTest.set(1, 99);
        for(int i = 0; i < arrListTest.getSize(); i++){
            System.out.println("size! : " + arrListTest.get(i));
        }

        System.out.println("clear");
        arrListTest.clear();
        System.out.println("size : " + arrListTest.getSize());

        System.out.println("hashSet");
        MyHashSet<String> set = new MyHashSet();
        set.add("test");
        System.out.println("set contain : " + set.contains("test"));
        set.remove("test");
        System.out.println("set contain : " + set.contains("test"));


        List<Integer> list = new ArrayList<>();

        list.add(1);


    }



}