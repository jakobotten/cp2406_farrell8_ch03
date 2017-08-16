import java.util.Scanner;
public class CraftPricing {
    public static void main(String[] args) {
        String productName;
        double materialsCost;
        double hoursWorked;
        double retailPrice;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        productName = input.next();
        System.out.print("Enter the cost of materials: ");
        materialsCost = input.nextDouble();
        System.out.print("Enter the number of hours worked: ");
        hoursWorked = input.nextDouble();
        retailPrice = calculateRetailPrice(materialsCost, hoursWorked);
        System.out.println("Product Name: " + productName + " Retail Price: " + retailPrice);
    }

    public static double calculateRetailPrice(double materialsCost, double hoursWorked) {
        final int COST_PER_HOUR = 12, SHIPPING_COST = 7;
        double retailPrice;
        retailPrice = materialsCost + COST_PER_HOUR * hoursWorked + SHIPPING_COST;
        return retailPrice;
    }

}
