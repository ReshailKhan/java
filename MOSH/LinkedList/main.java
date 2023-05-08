package MOSH.LinkedList;


import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
//        list.removeFirst();
//        list.removeLast();

        System.out.println(list.indexOf(30));
        System.out.println(list.contains(30));
        System.out.println(Arrays.toString(list.toArray()));
        list.reverseLinkList();
        System.out.println(Arrays.toString(list.toArray()));

        var list1 = new LinkedList();

        list1.addLast(10);
        list1.addLast(20);
        list1.addLast(30);
        list1.addLast(40);
        list1.addLast(50);
        list1.addLast(60);
        list1.addLast(70);
        list1.addLast(80);
        list1.addLast(90);
        list1.addLast(100);
        list1.addLast(110);
        list1.addLast(120);
        list1.addLast(130);
        list1.addLast(140);
        list1.addLast(150);
        list1.addLast(160);
        list1.addLast(170);
        list1.addLast(180);

        System.out.println(list1.getKthNodeFromTheEnd(10));
    }
}
