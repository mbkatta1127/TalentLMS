import java.util.Scanner;
public class Sine {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for x and n: ");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int dem = 1;
        double ans = 0; 
        if(n>0){
            for(int i = 1; i<=n;i++){
                if(i%2==0) ans-= Math.pow(x,dem)/getFactorial(dem);
                else ans+=Math.pow(x,dem)/getFactorial(dem);
                dem+=2;
            }
        }
        System.out.println(ans);
    }

    public static int getFactorial(int number){
        int ans = 1;
        while(number>0){
            ans *= number;
            number--;
        }
        return ans;
    }
}
