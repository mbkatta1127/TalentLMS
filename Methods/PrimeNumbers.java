import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args){
        for(int i = 1; i<=500; i++){
            if(isPrime(i)) System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int number){
        if (number==1) return false;

        for(int i = 2; i<=Math.sqrt(number); i++){
            if(number%i==0 && number!=i) {
                return false;}
        }
        return true;
    }
}