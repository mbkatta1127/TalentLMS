import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a an integer: ");
        
        System.out.println(isPalindrome(sc.nextInt()));
        sc.close();
    }

    public static boolean isPalindrome(int i){
        String numS= String.valueOf(i);
        int rightPointer = numS.length()-1;

        for (int leftPointer = 0; leftPointer < numS.length()/2; leftPointer++){
            if(numS.charAt(leftPointer)!=numS.charAt(rightPointer)) return false; 
            rightPointer--;
        }
        return true; 
    }
}

