import java.util.Scanner;

public class Menu {
    public static String[] intArray; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false; 

        while(quit != true){
            System.out.println("Welcome. Type your choice.");
            System.out.println("a. Accept elements of an array");
            System.out.println("b. Display elements of an array.");
            System.out.println("c. Search the element within array given by user.");
            System.out.println("d. Sort the array using bubble sort method.");
            System.out.println("q. Quit.");
            String choice = sc.nextLine();

            switch (choice.charAt(0)){
                case 'a':
                    intArray = acceptElements(sc);
                    break;
                case 'b':
                    displayElements(intArray);
                    break;
                case 'c':
                    System.out.println("Element in array: " + findElement(sc)); 
                    break;
                case 'd':
                    bubbleSort(intArray);
                    break;
                case 'q':
                    quit = true; 
                    break;
            }
        
        }

        sc.close();
    }

    public static String[] acceptElements(Scanner sc){
        System.out.println("Input a set of integers separated by a comma: ");
        String setOfIntegers = sc.nextLine();

        intArray = setOfIntegers.split(",");
        return intArray;
    }

    public static void displayElements(String[] intArray){
        if(intArray==null || intArray.length==0){
            System.out.println("Empty array");
            return;
        }
        for(int i =0; i<intArray.length; i++){
            System.out.print(intArray[i] + ",");
        }
        System.out.println();
    }

    public static boolean findElement(Scanner sc){
        System.out.println("What element are you looking for? ");
        int element = Integer.parseInt(sc.nextLine());

        if(intArray==null) return false;
        for(int i =0; i<intArray.length; i++){
            if(Integer.parseInt(intArray[i]) == (element)) return true; 
        }
        return false;
    }

    public static void bubbleSort(String[] array){
        //boolean swaps; 
        for(int i = array.length-1; i>0; i--){
        
            for(int j = 0; j<i; j++){
                if(Integer.parseInt(array[j])>Integer.parseInt(array[i])){
                    String temp = array[j];
                    array[j]=array[i]; 
                    array[i] = temp;
                }
            } 
        }
    }
}
