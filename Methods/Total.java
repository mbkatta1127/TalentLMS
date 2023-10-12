import java.util.Scanner;

public class Total {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(getTotal(x,y));
    }

    public static int getTotal(int x, int y){
        return x+y;
    }
}
