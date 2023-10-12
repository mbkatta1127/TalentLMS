public class PrintingPyramids {
    public static void main(String[] args) {
        firstQ(); 
        secondQ();
        thirdQ();
        fourthQ();
        fifthQ();
        sixthQ();
    }

    public static void firstQ()
    {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void secondQ()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void thirdQ()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5-i; j > 0; j--) {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void fourthQ()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" " );
            }
            for (int k = 1; k <= 2*(i-1)+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void fifthQ()
    {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" " );
            }
            for (int k = 1; k <= 2*(i-1)+1; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void sixthQ()
    {
        int temp = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = temp; j > 1; j--) {
                System.out.print(" " );
            }

            for (int k = i; k != 0; k--) {
                System.out.print(k);
            }
            temp--;

            for(int m = 2; m <=i; m++){
                System.out.print(m);
            }

            System.out.println();
        }
    }
}
