package AT;

public interface inter {
    public String lol="100";
    void method1();
    default void print(String value){
        System.out.println("default value"+value);
    }


}
