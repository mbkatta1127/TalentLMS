import java.util.Scanner;

public class LargestAndSmallestElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a set of integers separated by a comma: ");
        String setOfIntegers = sc.nextLine();

        String[] ints = setOfIntegers.split(",");
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        for(int i =0; i<ints.length; i++){
            int num = Integer.parseInt(ints[i]);
            if (num<smallest) smallest = num;

            if (num>largest) largest = num;
        }
        
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        sc.close();
    }
}
