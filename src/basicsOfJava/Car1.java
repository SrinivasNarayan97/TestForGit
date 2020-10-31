package basicsOfJava;

public class Car1 {

    String model;
    int price;
    int wheels;
//more
    public static void main(String[] args) {
        Car1 a=new Car1();
        Car1 b=new Car1();
        Car1 c=new Car1();
        Car1 cc=new Car1();
        a.model="BMW";
        a.price=20000;
        a.wheels=4;

        System.out.println("model of the car is "+a.model);
        System.out.println("price="+a.price);
        System.out.println("wheels="+a.wheels);
    }


}
//hot key for System.out.println()--->sout+Enter