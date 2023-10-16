import java.util.Scanner;

public class MiddleRowCol {
    public static int[][] intArray;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false; 

        while(quit != true){
            System.out.println("Welcome. Type your choice.");
            System.out.println("a. Enter Elements.");
            System.out.println("b. Display 2-D Array.");
            System.out.println("c. Print middle row and middle column.");
            System.out.println("q. Quit.");
            String choice = sc.nextLine();

            switch (choice.charAt(0)){
                case 'a':
                    enterElements(sc);
                    break;
                case 'b':
                    displayArray();
                    break;
                case 'c':
                    printMiddleRowAndCol();
                    break;
                case 'q':
                    quit = true; 
                    break;
            }
        
        }

        sc.close();
    }

    public static int[][] enterElements(Scanner sc){
        System.out.println("Input size of matrix: ");
        int n = sc.nextInt();

        System.out.println("Enter 2-D Array Elements: ");
        
        intArray = new int[n][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                intArray[i][j] = sc.nextInt();
            }
        }
        sc.nextLine();
        return intArray;
    }

    public static void displayArray(){
        for(int i = 0; i<intArray.length; i++){
            for(int j = 0; j<intArray[0].length; j++){
                System.out.print(intArray[i][j] + " ");  
            }
            System.out.println();
        }
    }

    public static void printMiddleRowAndCol(){
        int middleIndex = intArray.length /2; 
        String middleRow = "Middle Row : "; 
        String middleCol = "Middle Column : "; 

        for(int i = 0; i<intArray.length; i++){
            middleRow += intArray[middleIndex][i] + " ";
            middleCol += intArray[i][middleIndex] + " ";
        }

        System.out.println(middleRow);
        System.out.println(middleCol);
    }
}
