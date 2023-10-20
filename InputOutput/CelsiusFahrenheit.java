import javax.swing.JOptionPane;

public class CelsiusFahrenheit {
    public static void main(String[] args) {
        int temp; 
        temp = Integer.parseInt(JOptionPane.showInputDialog("Enter temperature in Celcius"));
        JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit is " + (1.8*temp + 32));
    }
}
