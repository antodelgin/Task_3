package task3.solution2;

import java.util.Scanner;

public class Test02 { // class with main method
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); // Scanner class object to get user input
        // Accepting multiple employees
        System.out.print("Enter no. of employees: ");
        int employeeCount = sc.nextInt(); // no. of employees
        //Creates an array of Employee objects with a size of employeeCount.
        Employee02[] employees = new Employee02[employeeCount];
        // Loop to read input
        for (int i = 0; i < employeeCount; i++) {
            System.out.println("Enter employee"+(i+1)+" details ");
            System.out.print("Enter employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Enter employee monthly salary: ");
            double salary = sc.nextDouble();
            // Creating Employee object and store it in the array
            employees[i] = new Employee02(empId, name, salary);
        }
        sc.nextLine();
        sc.nextLine();

        // Accepting multiple products
        System.out.print("Enter the number of products: ");
        int productCount = sc.nextInt(); // no. of products
        //Creates an array of Product objects with a size of productCount.
        Product02[] products = new Product02[productCount];
        // Loop to read input
        for (int i = 0; i < productCount; i++) {
            System.out.println("Enter product"+(i+1)+" details");
            System.out.print("Enter Product ID: ");
            int pid = sc.nextInt();
            System.out.print("Enter Product Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Product Quantity: ");
            int quantity = sc.nextInt();
            // Creating Product object and store it in the array
            products[i] = new Product02(pid, price, quantity);
        }

        // Display income tax for each employee
        System.out.println("Income Tax for Employees:");
        for (int i = 0; i < employeeCount; i++) {
            employees[i].calcTax();
        }
        // Display sales tax for each product
        System.out.println("Sales Tax for Products:");
        for (int i = 0; i < productCount; i++) {
            products[i].calcTax();
        }
        sc.close(); // close Scanner class object
    }
}

