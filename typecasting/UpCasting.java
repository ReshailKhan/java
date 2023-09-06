package typecasting;

public class UpCasting {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Auto-upcasting
        // Dog dog = (Dog) new Animal(); // Auto-down-casting   this code give compile time error
        animal.sound();
        //dog.sound();
        // Calls Dog's overridden sound() method
//      int a = 10.0;
        float f = 10.0f;
        byte a = (byte) 131;
        System.out.println(a);
        byte a1 = 10;
        byte a2 = 20;
        byte aa = (byte) (a1 + a2);
        System.out.println(aa);
        float aaa = 10.0F;
        String temp = Float.toString(f);
//      String temp = Integer.toString(a);
//      System.out.println(temp);
        fnGetNumber(1);

//      byte + byte = int , byte +short+ int, short +byte = int
//      int + long + double + float = float  result will be save in higher data type

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
