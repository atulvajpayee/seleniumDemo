class overriding {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.Animal();
        Lion lion = new Lion();
        lion.Animal();
    }

}
public class ani {
    void Animal(){
        System.out.println("Animals");
    }
}
class Lion extends ani{
    @Override
    public void Animal() {
        /*super.Animal();*/
        System.out.println("Lion is terrestrial animals");
    }
}
class Fish extends ani{
    @Override
    public void Animal() {
        /*super.Animal();*/
        System.out.println("Fish is aquatic animals");
    }
}
