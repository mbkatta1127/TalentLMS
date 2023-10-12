import java.util.Scanner;

public class TelephoneBill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number of calls: ");
        int numOfCalls = sc.nextInt(); 

        if(0<numOfCalls && numOfCalls<=100){
            System.out.println(numOfCalls*200);
        }
        
        else if(100<numOfCalls && numOfCalls<=150){
            System.out.println(200*(100) + 0.6*(numOfCalls-100));
        }

        else if(150<numOfCalls && numOfCalls<=200){
            System.out.println(200*100 + 0.6*50 + 0.5*(numOfCalls-150));
        }

        else{
            System.out.println(200*100 + 0.6*50 + 0.5*50 + 0.4*(numOfCalls-200));
        }


    }
}
