package variable;

public class TypeChange {

    public  static  void main(String[] args){
        double doubleNumber = 10.101010;

//        double -> int
        int intNumber;
        intNumber = (int)doubleNumber; // 10

        System.out.println("int = " + intNumber);

//        int -> float
        int intNumber2 = 10;
        float floatNumber2 = (float)intNumber2;

        System.out.println(floatNumber2); // 10.0

//        변수 타입별 크기 순서
//        byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
//        작은 크기의 타입이 큰 크기의 타입과 "계산"이 될 때,
//        자동으로 큰 크기의 타어ㅣㅂ으로 형 변환이 이루어짐

//        (1) byte -> int
        byte byteNumber = 10;
        int intNumber3 = byteNumber; // 10


//        (2) char -> int
        char myChar = 'A';
        intNumber3 = myChar; // char -> int로 자동 형변환
        System.out.println(intNumber3); // 65 (ascii)

//        (3) int -> long number
        int intNumber4 = 100;
        long longNumber = intNumber4;

//        (4) int -> double
        int intNumber5 = 200;
        double doubleNumber2 = intNumber5;
        System.out.println(doubleNumber2); // 200.0


    }
}
