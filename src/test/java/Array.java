import java.util.ArrayList;
public class Array {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
      cars.add("Baleno");
      cars.add("i20");
      cars.add("Xuv300");
        cars.add("Xuv700");
        System.out.println(cars);
        System.out.println(cars.get(1));
        System.out.println(cars.set(0,"Swift"));
        System.out.println(cars);
        System.out.println(cars.remove(1));
        System.out.println(cars);
    }
}
