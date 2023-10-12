import java.util.Scanner;

public class NumOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String st = sc.nextLine();
        int count = 0; 

        for(int i = 0; i<st.length(); i++){
            if(isVowel(st.charAt(i))) count++;
        }
        System.out.println(count);
    }

    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') return true;
        else return false;
    }
}

