public class Even {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isEven(4));
    }

    public static boolean isEven(int x){
        if (x%2==0) return true;
        else return false;
    }
}
