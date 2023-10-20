import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the 3 sides of a triangle ");
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double s = (a+b+c)/2; 
        System.out.println("Area: " + Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}
