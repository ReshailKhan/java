package passbyvalueandreferece;

public class PassByReference {
    int a = 10;
    void call(PassByReference eg) {
        eg.a = eg.a+10;
    }

    public static void main(String[] args) {

        PassByReference eg = new PassByReference();
        System.out.println("Before call-by-reference: " + eg.a);

        // passing the object as a value using pass-by-reference
        eg.call(eg);
        System.out.println("After call-by-reference: " + eg.a);


    }
}
