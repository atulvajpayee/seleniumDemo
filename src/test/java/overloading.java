public class overloading {
    void disp(int a, double b){
        System.out.println("Method A");
    }
    void disp(int a, int b){
        System.out.println("Method B");
    }
    void disp(double a, int b){
        System.out.println("Method C");
    }
    void disp(double a, double b){
        System.out.println("Method D");
    }


    public static void main(String args[]){

        overloading obj = new overloading();

        obj.disp(100.90, 20.67);
    }
}
