import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int temp = 0; 

        for(int i = 1; i<=n;i++){
            if(i==1) System.out.println(first);
            else if(i==2) System.out.println(second);
            else{
                temp=first+second;
                System.out.println(temp);
                first=second; 
                second = temp;
            }
        }
        sc.close();
    }
}
