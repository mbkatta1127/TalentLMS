public class ComplexDemo {
    public static void main(String[] args) {
        Complex cn1 = new Complex(5, -1);
        Complex cn2 = new Complex(-3, 2);
        System.out.println(cn1.add(cn2).toString());
        System.out.println(cn1.subtract(cn2).toString());
        System.out.println(cn1.multiply(cn2).toString());
        System.out.println(cn1.divide(cn2).toString());

        System.out.println(cn1.toString());
        System.out.println(cn2.toString());
    }
}
