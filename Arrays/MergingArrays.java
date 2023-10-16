import java.util.Scanner;

public class MergingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input a set of ascending integers separated by a comma: ");
        String setOfIntegersA = sc.nextLine();
        String[] arrayA = setOfIntegersA.split(",");

        System.out.println("Input a set of descending integers separated by a comma: ");
        String setOfIntegersB = sc.nextLine();
        String[] arrayB = setOfIntegersB.split(",");

        String[] arrayC = new String[arrayA.length + arrayB.length]; 
        System.out.println("arrayc length: " + arrayC.length);
        int i = 0;
        int j = arrayB.length - 1; 
        int c = 0; 
        
        //Merge arrays in ascending order
        while(i<= arrayA.length - 1 || j>=0){
            if((i<= arrayA.length - 1) && (j>=0) && (Integer.parseInt(arrayA[i]) <= Integer.parseInt(arrayB[j]))){
                arrayC[c] = arrayA[i]; 
                i++;
                c++;
            }

            else{
                arrayC[c] = arrayB[j];
                j--;
                c++;
            }
        }

        //Print merged array 
        for(int k = 0; k<arrayC.length; k++){
            System.out.println(arrayC[k]);
        }
    }
    
}
