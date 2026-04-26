import java.security.Key;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("add value");
        arrListTest<Integer> arrListTest = new arrListTest<>();
        arrListTest.add(1);
        arrListTest.add(2);
        arrListTest.add(3);
        arrListTest.add(4);

        arrListTest.removeIdxForSet(1);
        System.out.println("size : " + arrListTest.getSize());
        System.out.println("last idx removal test : "+ arrListTest.get(0));

        for (int i = 0; i < arrListTest.getSize(); i++) {
            System.out.println("size check : " + arrListTest.get(i));
        }

        MyNodeList myNodeList = new MyNodeList();
        myNodeList.add(1);
        myNodeList.add(2);
        myNodeList.add(3);
        myNodeList.addFirst(4);
        System.out.println("remove my linkedList");
        myNodeList.remove(3);



        System.out.println("node list order");
        Node current = myNodeList.head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }

        System.out.println("node size : " + myNodeList.size());
        myNodeList.clear();
        System.out.println("node size : " + myNodeList.size());


        System.out.println("HashMap");
        MyHashMap hashMap = new MyHashMap();
        hashMap.put("01", "test1");
        hashMap.put("02", "test2");
        hashMap.put("03", "test3");

        System.out.println("get HashMap");
        System.out.println(hashMap.getValue("01"));
        System.out.println(hashMap.remove("01"));
        System.out.println(hashMap.getValue("01"));
        System.out.println("hashmap size : " + hashMap.size());
    }
}