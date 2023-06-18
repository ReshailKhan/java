package AT;

import MOSH.Main;

public class InterviewOverRide {
    public static void main(String[] args) {
        A a = new A();
        a.test(1111111111L, 5555555555L);
    }
}

class A {

    void test(long a, long b){
        System.out.println("1st -> " + a + " " + b);
    }

    void test(int a, int b){
        System.out.println("2nd -> " + a + " " + b);
    }
    void test(int a, long b){
        System.out.println("3rd -> " + a + " " + b);
    }

    public static void main(String[] args) {
        A a = new A();
        a.test(1,5);
    }
}
