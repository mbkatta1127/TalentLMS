import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int sum = 0; 

        for(int i = 0; i<10; i++){
            sum+=sc.nextInt();
        }

        System.out.println(sum);
    }
}
