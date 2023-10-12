import java.util.Scanner;

public class DiscountAndRevenue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a price:");
        double price = sc.nextDouble();
        System.out.println("Enter the quantity:");
        int quantity = sc.nextInt();
        double revenue = price * quantity;
        if(revenue<=5000){
            System.out.println("Revenue: " + revenue);
        }
        else{
            double discount = 0.1*revenue;
            System.out.println("Discount: " + discount);
            System.out.println("Net Revenue: " + (revenue-discount));
        }
    }
}
