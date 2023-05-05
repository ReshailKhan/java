package MOSH;



public class Main {
    public static void main(String[] args) {
        Array array = new Array(3);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.printAll();
        array.delete(2);
        System.out.println("___________________________________");
        array.printAll();
        System.out.println("___________________________________");
        array.indexOf(111);

    }
}
