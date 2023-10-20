import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        System.out.println("Input number of seconds since midnight");
        Scanner sc = new Scanner(System.in); 
        Clock firstClock = new Clock(sc.nextInt());

        for(int i = 0; i<10; i++){
            firstClock.tik();
            System.out.println(firstClock.toString());
        }

        System.out.println("Let's make a new clock. Please enter hours, minutes, and seconds");
        Clock secondClock = new Clock(sc.nextInt(),sc.nextInt(), sc. nextInt()); 
        
        for(int i = 0; i<10; i++){
            secondClock.tik();
            System.out.println(secondClock.toString());
        }

        firstClock.addClock(secondClock);
        System.out.println(firstClock.toString());
        System.out.println(secondClock.toString()); 
        Clock thirdClock = firstClock.subtractClock(secondClock); 
    }
}
