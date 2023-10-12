import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number: ");

        int randNum = (int) (Math.random() * 100) + 1; 
        int guess = sc.nextInt();

        while(randNum != guess){
            if(randNum>guess) System.out.println("Too low, try again");
            if(randNum<guess) System.out.println("Too high, try again");
                
            guess = sc.nextInt();
        }
        
        System.out.println("Correct guess!");
        sc.close();
    }
}
