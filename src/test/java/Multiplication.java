public class Multiplication {

    static int mulMethod(int x, int y) {
        return x * y;
    }

    static double mulMethod(double x, double y) {
        return x * y;
    }

    public static void main(String[] args) {
        int myNum1 = mulMethod(8, 5);
        double myNum2 = mulMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
