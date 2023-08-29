package AT;

public abstract class Abst {
    public String lol;
    abstract void method1();
    void print(String value){
        System.out.println("Abst print value"+value);
    }

    static void hello1(){
        System.out.println("static method from Abst is called");
    }

    public Abst() {
        System.out.println("Abst constructor call");
    }
}
