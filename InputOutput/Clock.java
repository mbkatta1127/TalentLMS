import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        System.out.println("Enter the number of seconds: ");
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();  
        int hours = seconds/3600;
        int minutes = (seconds - hours*3600)/60;
        seconds = (seconds - hours*3600 - minutes*60); 
        System.out.println("Hours: " + hours); 
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);  
    }


}




