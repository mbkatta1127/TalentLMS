import java.util.Scanner;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in); 
        String word = sc.nextLine();

        System.out.println("Pig Latin: " + word.substring(1,word.length()) + "ay");
    }
}
