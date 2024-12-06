package task3.solution2;
// Product class implements Taxable interface
public class Product02 implements Taxable02 {
    // Private fields to store product details
    private int pid;
    private double price;
    private int quantity;
    // Constructor to initialize product
    public Product02(int pid, double price, int quantity){
        this.pid=pid;
        this.price=price;
        this.quantity=quantity;

    }

    @Override
    //Overriding calcTax method from Taxable interface
    public void calcTax() {
        // Calculate sales tax for single unit of the product.
        double salesTaxUnitProduct= price * salesTax;
        System.out.println("Pid: "+pid+ " Price: "+price+ " SalesTax: "+salesTaxUnitProduct);

    }
}
