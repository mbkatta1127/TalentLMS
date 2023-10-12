import java.util.Scanner;

public class ValidTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter triangle angle. Must be an integer: ");
        int first = sc.nextInt();
        System.out.println("Enter triangle angle. Must be an integer: ");
        int second = sc.nextInt();
        System.out.println("Enter triangle angle. Must be an integer: ");
        int third = sc.nextInt();
        
        if(first+second+third==180){
            System.out.println("Valid Triangle");
        }
        else{
            System.out.println("Invalid Triangle");
        }
    }
}
