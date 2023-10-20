import java.util.Scanner;

public class WallPaintingCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the length of the walls");
        Scanner sc = new Scanner(System.in); 
        int length = sc.nextInt();

        System.out.println("Enter the width of the walls");
        int width = sc.nextInt();

        System.out.println("Enter the height of the walls");
        int height = sc.nextInt();

        System.out.println("Enter the number of the windows");
        int numOfWindows = sc.nextInt();

        System.out.println("Enter the number of the doors");
        int numOfDoors = sc.nextInt();

        double totalSQOfWalls = 5*length*width*height; 

        System.out.println("Number of gallons of paint needed: " + (totalSQOfWalls - (numOfDoors)*(20) - (numOfWindows)*(15))/350);
    }
}
