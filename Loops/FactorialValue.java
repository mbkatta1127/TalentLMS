import java.util.Scanner;

public class FactorialValue {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a factorial number: ");
        int number = sc.nextInt();
        int ans = 1;

        while(number>0){
            ans *= number;
            number--;
        }

        System.out.println(ans);
        sc.close();
    }
}
