package MOSH.LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }

    }
    private Node first;
    private Node last;
    private int size = 0;

    public void addLast(int item){
        var node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else {
            last.next = node;
            last = node;
        }
        size ++;
    }

    public void addFirst(int item){
        var node = new Node(item);
        if(isEmpty()){
            first = last = node;
        }else {
            node.next = first;
            first = node;
        }
        size ++;
    }

    private boolean isEmpty(){
        return first == null;
    }

    public int indexOf(int item){
        int index = 0;
        var current = first;
        while (current!=null){
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int item){
        return indexOf(item) != -1;
    }

    public void removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        if (first == last){
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
        size --;
    }

    public void removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        if (first == last){
            first = last = null;
            return;
        }
        var previous = getPreviousNode();
        last = previous;
        last.next = null;
        size --;
    }

    private Node getPreviousNode(){
        var current = first;
        while (current != null){
            if (current.next == last) return current;
            current = current.next;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public int[] toArray (){
        int [] array = new int[size()];
        var current = first;
        for (int i = 0; i < size;i++){
            array[i] = current.value;
            current = current.next;
        }
        return array;
    }
    public void reverseLinkList(){
        if(isEmpty())
            throw new NoSuchElementException();
        if (first == last){
            return;
        }
        var first = this.first;
        Node next ;
        Node previous = null;

        while (first != null){
            next = first.next;
            first.next = previous;
            previous = first;
            first = next;

        }
        this.first = previous;
        last = null;
    }

    public int getKthNodeFromTheEnd(int node){
        if (node > size){
            System.out.println("Value of K is greater the size of LinkedList");;
            return node;
        }
        boolean condition = true;
        var first = this.first;
        var second = this.first;
        for (int i = 0; i < node-1; i++){
            second = second.next;
        }
        while (second != last){
            first = first.next;
            second = second.next;
        }
        return first.value;
    }
}
