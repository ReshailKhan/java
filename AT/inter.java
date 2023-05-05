package AT;

public interface inter {

    void method1();
    default void print(String value){
        System.out.println("default value"+value);
    }
}
