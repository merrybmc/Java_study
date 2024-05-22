package OOP;

public class Main {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

//        외부 접근 - 외부에서 객체 내부의 필드에 접근
        System.out.println(car1.gear); // null
        car1.changeGear('P');
        System.out.println(car1.gear); // P

        car2.changeGear('N');
        car3.changeGear('D');

        carArray[0] = car1;
        carArray[1] = car2;
        carArray[2] = car3;

//        객체 생성
//        초기값 기본 값 확인 : 초기값을 준 것은 그 값이 기본 값으로 들어가고 아닌 값은 null
        Car car = new Car();
        System.out.println(car.model); // GV80
        System.out.println(car.gear); // null

//        필드 사용
        System.out.println(car.color); // null
        car.color = "blue";
        System.out.println(car.color); // blue

        System.out.println(car.speed); // 0
        System.out.println(car.gear); // null

        double speed = car.gasPedal(100,'D');
        System.out.println(car.speed); // 100
        System.out.println(car.gear); // D

        System.out.println(car.lights); // true
        boolean lights = car.onOffLight();
        System.out.println(car.lights); // false

        car.carSpeed(100,80); // v = 100, v= 80

        car.carSpeed(100,120,150); // v = 100, v= 80
    }
}
