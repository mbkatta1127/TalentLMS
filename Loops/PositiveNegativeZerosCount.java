import java.util.Scanner;

public class PositiveNegativeZerosCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a set of integers separated by a comma: ");
        String setOfIntegers = sc.nextLine();

        String[] ints = setOfIntegers.split(",");
        int positiveCount, negativeCount, zeroCount;
        positiveCount = negativeCount = zeroCount= 0;
        
        for(int i =0; i<ints.length; i++){
            if (Integer.parseInt(ints[i])>0) positiveCount++;
            else if (Integer.parseInt(ints[i])<0) negativeCount++;
            else zeroCount++;
        }
        
        System.out.println("Number of Positive Numbers: " + positiveCount);
        System.out.println("Number of Negative Numbers: " + negativeCount);
        System.out.println("Number of Zero Numbers: " + zeroCount);
        sc.close();
    }
}
