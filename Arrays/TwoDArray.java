import java.util.Scanner;

public class TwoDArray {
    public static int[][] intArray; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false; 

        while(quit != true){
            System.out.println("Welcome. Type your choice.");
            System.out.println("a. Input elements into matrix of size m * n.");
            System.out.println("b. Display elements into matrix of size m * n.");
            System.out.println("c. Sum of elements into matrix of size m * n.");
            System.out.println("d. Display row-wise sum of elements in matrix of size m * n.");
            System.out.println("e. Display column-wise sum of elements in matrix of size m * n.");
            System.out.println("f. Create transpose of matrix of size m * n.");
            System.out.println("q. Quit.");
            String choice = sc.nextLine();
            //System.out.println("error after accepting choice");

            switch (choice.charAt(0)){
                case 'a':
                    intArray = enterElements(sc);
                    break;
                case 'b':
                    displayArray(intArray);
                    break;
                case 'c':
                    sumAllElements();
                    break;
                case 'd':
                    sumOfRows();
                    break;
                case 'e':
                    sumOfColumns();
                    break;
                case 'f':
                    transpose();
                    break;
                case 'q':
                    quit = true; 
                    break;
            }
        
        }

        sc.close();
    }

    public static int[][] enterElements(Scanner sc){
        System.out.println("Input value for m: ");
        int m = sc.nextInt();

        System.out.println("Input value for n: ");
        int n = sc.nextInt();

        System.out.println("Enter 2-D Array Elements: ");
        
        intArray = new int[m][n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                intArray[i][j] = sc.nextInt();
            }
        }
        sc.nextLine();
        return intArray;
    }

    public static void displayArray(int[][] array){
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){
                System.out.print(array[i][j] + " ");  
            }
            System.out.println();
        }
    }

    public static void sumAllElements(){
        int sum = 0;

        for(int i = 0; i<intArray.length; i++){
            for(int j = 0; j<intArray[0].length; j++){
                sum+= intArray[i][j];   
            }
        }

        System.out.println("Sum of All Elements: " + sum);
    }

    public static void sumOfRows(){
        int sum = 0;

        for(int i = 0; i<intArray.length; i++){
            for(int j = 0; j<intArray[0].length; j++){
                sum+= intArray[i][j];   
            }
            System.out.println("Sum of row " + (i+1) + ": " + sum);
            sum = 0; 
        }
    }

    public static void sumOfColumns(){
        int sum = 0;
        
        for(int j = 0; j<intArray[0].length; j++){
            for(int i = 0; i<intArray.length; i++){
                sum+= intArray[i][j];   
            }
            System.out.println("Sum of column " + (j+1) + ": " + sum);
            sum = 0; 
        }
    }

    public static void transpose(){
        int[][] newArray = new int[intArray[0].length][intArray.length]; 
        for(int i = 0; i<intArray.length; i++){
            for(int j = 0; j<intArray[0].length; j++){
                newArray[j][i] = intArray[i][j]; 
            }
        }

        displayArray(newArray);
        
    }

}

