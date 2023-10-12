import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a an integer: ");
        String numS= String.valueOf(sc.nextInt());
        String ans = "";

        for (int i = numS.length() - 1; i>=0; i--){
            ans += numS.charAt(i);
        }

        System.out.println(ans);
        sc.close();
    }
}
