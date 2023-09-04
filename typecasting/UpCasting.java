package typecasting;

public class UpCasting {
    private static void main(String[] args) {
            Animal animal = new Dog(); // Auto-upcasting
            // Dog dog = (Dog) new Animal(); // Auto-down-casting   this code give compile time error
            animal.sound();
            //dog.sound();
            // Calls Dog's overridden sound() method
//        int a = 10.0;
            float f = 10.0f;
        String temp = Float.toString(f);
//        String temp = Integer.toString(a);
//        System.out.println(temp);
//         fnGetNumber(1.0);
    }

    public static void fnGetNumber(int a){
        System.out.println(a);
    }

    public static void fnGetNumber(String a){
        System.out.println(a);
    }

    public static void fnGetNumber(float a){
        System.out.println(a);
    }

    public static void fnGetNumber(double a){
        System.out.println(a);
    }
}
