package typecasting;

public class typecasting {

    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        Integer integer = myInt;
        Double doub = 0.0;

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        myInt = (int) myDouble;
        doub = (double) myInt;




        /* *
        * Widening Casting (automatically) - converting a smaller type to a larger type size
          byte -> short -> char -> int -> long -> float -> double
          Narrowing Casting (manually) - converting a larger type to a smaller size type
        * double -> float -> long -> int -> char -> short -> byte
        * */
    }
}
