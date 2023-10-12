import java.util.Scanner;

public class SumOfEvensOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a set of integers separated by a comma: ");
        String setOfIntegers = sc.nextLine();
        
        String[] ints = setOfIntegers.split(",");
        int evenSum, oddSum;
        evenSum = oddSum = 0;
        
        for(int i =0; i<ints.length; i++){
            if (Integer.parseInt(ints[i])%2==0) evenSum+=Integer.parseInt(ints[i]);
            
            else oddSum+=Integer.parseInt(ints[i]);
        }

        System.out.println("Even Sum: " + evenSum);
        System.out.println("odd Sum:" + oddSum);
        sc.close();
    }
}
