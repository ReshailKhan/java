package typecasting;

public class UpCasting {
    public static void main(String[] args) {
            Animal animal = new Dog(); // Auto-upcasting
            // Dog dog = (Dog) new Animal(); // Auto-down-casting   this code give compile time error
            animal.sound();
            //dog.sound();
            // Calls Dog's overridden sound() method
//        int a = 10.0;
//        String temp = Integer.toString(a);
//        System.out.println(temp);
    }

}
