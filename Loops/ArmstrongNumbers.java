public class ArmstrongNumbers {
    public static void main(String[] args) {
        int sum = 0; 
        for(int i=1; i<=500; i++){
            String num = "" + i;
            
            for(int j = 0; j<num.length(); j++){
                int digit = Integer.parseInt("" + num.charAt(j));
                sum+=(digit*digit*digit);
            }

            if (sum==i) System.out.println(i);
            sum = 0;
        }
    }
}
