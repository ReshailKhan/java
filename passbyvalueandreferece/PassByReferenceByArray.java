package passbyvalueandreferece;

public class PassByReferenceByArray {
    static char[] myArray = {'a', 'b', 'c'};
    public static void main(String[] args) {

        add(myArray);
        System.out.println(myArray); // Prints: "abcde"
    }

    public static void add(char[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (array[i]);
        }
        array = new char[] {'d', 'e'}; // This line does not affect the original array.
    }
}
