package OOP;

public class Main {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        System.out.println(car1.gear); // null
        car1.changeGear('P');
        System.out.println(car1.gear); // P

        car2.changeGear('N');
        car3.changeGear('D');

        carArray[0] = car1;
        carArray[1] = car2;
        carArray[2] = car3;

    }
}
