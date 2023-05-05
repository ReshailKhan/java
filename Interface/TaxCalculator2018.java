package Interface;

public class TaxCalculator2018 implements TaxCalculator {
    private double taxableIncome;

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public TaxCalculator2018(){}
    public TaxCalculator2018(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }
    @Override
    public double calculateTax(){
        return taxableIncome* 0.3;
    }
}
