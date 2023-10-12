import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a base number & exponent: ");
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int answer = 1;

        while(exponent>0){
            answer *= base;
            exponent--;
        }

        System.out.println(answer);
        sc.close();
    }
}
