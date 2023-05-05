package Interface;

public interface TaxCalculator {
    double calculateTax();

    default String calculate(){
        return "hello";
    }
}
