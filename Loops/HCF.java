import java.util.Scanner;

public class HCF {
    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        int count = Math.min(firstNumber,secondNumber);
        
        while(count > 0){
            if(firstNumber%count==0 && secondNumber%count==0) {
                System.out.println("HCF: " + count);
                break;
            }
            count--;
        }
        sc.close();

    }
}
