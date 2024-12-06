package task3.solution2;
// Employee class implements Taxable interface
public class Employee02 implements Taxable02 {
    // Private fields to store employee details
    private int empId;
    private String name;
    private double salary;

    // Constructor to initialize the employee object
    public Employee02(int empId, String name, double salary){
        this.empId=empId;
        this.name=name;
        this.salary=salary;

    }
    @Override
    // Overriding calcTax method from Taxable interface
    public void calcTax() {   // calculate IncomeTax on yearly salary
        double yearlySalary=salary*12;
        double incomeTaxAmount=yearlySalary*incomeTax;
        System.out.println("Employee ID: "+empId+" Name: "+name+" Income Tax: "+incomeTaxAmount);
    }
}
