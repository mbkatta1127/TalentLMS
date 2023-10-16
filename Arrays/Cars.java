import java.util.ArrayList;

public class Cars {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Honda Civic");
        cars.add("BMW");
        cars.add("Audii Q5");

        for(int i = 0; i<cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
