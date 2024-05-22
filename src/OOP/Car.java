package OOP;

public class Car {
//        클래스를 설계하기 위해선 4가지 단계가 필요하다.
//        1. 만들고자 하는 설꼐도를 선언한다. (클래스 선언)
//        2. 객체가 가지고 있어야할 속성(필드)를 정의한다.
//        3. 객체를 생성하는 방식을 정의한다. (생성자)
//        4. 객체가 가지고 있어야할 행위(메서드)를 정의한다.

//        Car class 만들기

//        필드 정의
//    클래스에 필드를 정의했다고 해서 바로 사용할 수 있는 것이 아니다. (인스턴스화)
//    클래스는 설계도일 뿐 실제로 필드의 데이터를 가지고 있는 것은 객체이다.
//    객체를 생성한 후에 필드를 사용 가능하다.

//        고유 데이터 정의
        String company;
        String model = "GV80";
        String color;
        double price;

//        상태 데이터 정의
        double speed;
        char gear;
        boolean lights = true;

//        객체 데이터 정의 인스턴스화
        Tire tire = new Tire();
        Door door = new Door();
        Handle handle = new Handle();

//        생성자 정의
//        처음 객체가 생성될 때 (instance화 될 때)
//        어떤 로직을 수행해야 하며, 어떤 값이 필수로 들어와야할지 정의
        public Car () {
            System.out.println("success");
        }

//        메서드 정의
//    내부 접근 - 객체 내부 메서드에서 내부 필드에 접근
        double gasPedal(double kmh,char type) {
            changeGear(type); // 가속도 페달을 밟으면 자동으로 기어가 변하도록
            speed = kmh;
            return speed;
        }

        double breakPedal() {
            speed = 0;
            return speed;
        }
        char changeGear(char type) {
            gear = type;
            return gear;
        }

        boolean onOffLight() {
         lights = !lights;
         return lights;
        }

        void horn() {
            System.out.println("boom");
        }

//        자동차 속도 ... 가변길이 메서드
    void carSpeed(double ... speeds) {
            for(double v : speeds){
                System.out.println("v = " + v);
            }
    }
}
