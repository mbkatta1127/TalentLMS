import java.util.Scanner;

public class NaturalLog {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        boolean pnFlag = true;
        double sum = 0;
        for(int i = 1;i<=n;i++){
            if (pnFlag){
                sum += (double) 1/i;
                pnFlag = false; 
            }

            else{
                sum -= (double) 1/i;
                pnFlag = true;
            } 
        }
        System.out.println(sum);
        sc.close();
    }
}
