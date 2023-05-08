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
    }
}
