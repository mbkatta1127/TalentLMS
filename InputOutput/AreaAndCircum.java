import java.util.Scanner;

public class AreaAndCircum {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt(); 
        System.out.println("Circumference " + (2*Math.PI*radius));
        System.out.println("Area: " + (Math.PI*radius*radius));
    }
}
