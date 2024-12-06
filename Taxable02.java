package task3.solution2;

public interface Taxable02 {
    double salesTax=0.07;  // Sales tax rate as constant.
    double incomeTax=0.105;  // Income tax rate as constant.
    // Abstract method to calculate tax, will be implemented by classes
    void calcTax();

}
