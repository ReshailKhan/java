package AT;

public class InterImplem implements inter{
    @Override
    public void method1() {
        System.out.println("Override method1 of InterImplem extends inter.");
    }

    @Override
    public void print(String value) {
        System.out.println("Override print of InterImplem extends inter.");
        inter.super.print(value);
    }
}
