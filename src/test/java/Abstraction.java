public class Abstraction {
    public static void main(String[] args) {
        Kia myCar = new Kia();
        myCar.CarStart();
        myCar.CarSpeed();
    }
}
abstract class Car {

    public abstract void CarStart();

    public void CarSpeed() {
        System.out.println("Maximum Speed is 320Kmph");
    }
}
class Kia extends Car {
    public void CarStart() {

        System.out.println("Auto Start");
    }
}


