import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number for variable a: ");
        int a = sc.nextInt();
        System.out.println("Enter a number for variable b: ");
        int b = sc.nextInt();
        System.out.println("Enter a number for variable c: ");
        int c = sc.nextInt();
        
        System.out.println("Largest Number: ");
        if(a>=b){
            if(a>=c){
                System.out.println(a);
            }

            else{
                System.out.println(c);
            }
        }

        else{
            if(b>=c){
                System.out.println(b);
            }
            else{
                System.out.println(c);
            }
        }

    }
}
