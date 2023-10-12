import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char status;
        do{
            System.out.println("Enter in two numbers: ");
            System.out.println(sc.nextInt() + sc.nextInt());

            System.out.println("Would you like to do this again? Y or N");
            status = sc.next().charAt(0);
        } while(status == 'y' || status == 'Y');
        sc.close();
    }
}
