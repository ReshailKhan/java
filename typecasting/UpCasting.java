package typecasting;

public class UpCasting {
    public static void main(String[] args) {
            Animal animal = new Dog(); // Auto-upcasting
            animal.sound();
            // Calls Dog's overridden sound() method
    }

}
