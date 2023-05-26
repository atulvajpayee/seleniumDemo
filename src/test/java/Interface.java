public class Interface {
    public static void main(String[] args) {
        Baleno myCar = new Baleno();
        Xuv300 XuvCar = new Xuv300();
        myCar.CarFueltypes();
        myCar.CarSpeeds();
        XuvCar.CarSpeeds();
        XuvCar.CarFueltypes();

    }

}
interface FeaturedCar {
    public void CarSpeeds();
    public void CarFueltypes();

}

class Baleno implements FeaturedCar {
    public void CarSpeeds() {
        System.out.println("Car Speed is 320 Kmh");
    }
    public void CarFueltypes() {
        System.out.println("Baleno is in CNG only");
    }
}
class Xuv300 implements FeaturedCar {
    public void CarSpeeds() {
        System.out.println("Car Speed is 240 Kmh");
    }
    public void CarFueltypes() {
        System.out.println("Xuv300 is in Petrol only");
    }
}


