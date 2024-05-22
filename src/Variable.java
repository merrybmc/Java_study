public class Variable {
    public static void main(String[] args){
        //      변수 선언 및 초기화
        int number; // number 이라는 이름의 int(숫자) 타입의 저장공간을 선언
        String name; // name 이라는 이름의 String(문자열) 저장공간을 선언

//      변수 재할당
        number = 10;
//      number = "java" // 다른 타입의 값으로 재할당시 오류 발생

        //      상수로 선언, js에서는 const와 동일
        final int constNumber = 10;

        //      논리형 변수 boolean
        boolean flag = true;

        //      문자형 변수 char
//      'A', '1' 과 같이 한 글자만 저장 가능, "" 불가능, ''로 유의
        char alphabet = 'A';

//      정수형 변수 (각 타입마다 사용되는 메모리가 다르다.)
//        1. byte (-128 ~ 127 범위의 숫자만 저장 가능) 1 byte
//        2. short (-32,768 ~ 32.767 범위의 숫자만 저장 가능) 2 bype
//        3. int (-21억 ~ 21억 범위의 숫자만 저장 가능) 4 byte
//        4. long (매우 큰 수 약 9백경의 숫자를 저장 가능) 숫자 뒤에 접미사 L이 붙음 (ex.214748L) 8 byte
//        long에 접미사를 붙이는 이유는 int와 데이터값(리터럴)을 구분하기 위한 구분자 표시를 위함

        byte myByte = 120;
        short myShort = 30000;
        int myInt = 12345678;
        long myLong = 1234567890L;

//        정수형 변수 표현 범위
//        각 변수 표현 범위를 넘는 숫자를 넣게 되면 오버플로우가 발생
//        해당 숫자를 출력해보면 입력값과 다른 값으로 표현된다.
//        (표현 범위를 초과한 것이기 때문에 입력한 값보다 작거나 음수인 값이 표현된다.)
//        그렇기 때문에 각 변수들의 표현 범위를 잘 알아야 버그가 생기지 않는다.

//        실수형 변수
//        실수형은 데이터 값을 구분하기 위해 숫자 뒤에 f 라는 접미사를 붙임 (ex. 12.345f)
//        float 4 byte (3.4 * 10^38 범위 표현 가능 / long보다 큰 수를 저장 가능)
//        double 8 byte (1.7 * 10&308 범위 표현 가능)

//        float가 4 byte만 쓰는데 long 보다 더 넓은 범위의 숫자를 저장 가능한 이유는
//        "부동 소수점 방식" 으로 숫자를 저장하기 때문
//        부동 소수점 방식 : 가수와 지수를 구분해서 저장하고 이 값들을 곱한 값을 저장(표현)하는 방식

        float myFloat = 12.345f;
        double myDouble = 345.6789f;
        
//        참조형 변수
//        문자열 변수 : String
//        "HelloWorld" 같은 긴 문장을 저장
        String MyString = "Hello World";

//        Object, Array, List...
//        객체, 배열, 리스트와 같은 단일 저장공간에 담을 수 없는 값을 저장
        int[] myObject = {1,2,3};

//        래퍼 클래스 변수 (Wrapper Class)
//        기본형 변수를 클래스로 감싸는 변수
//        기본 타입에서 래퍼 클래스 변수로 변수를 감싸는 것을 "박싱" 이라고 부르며
//        래퍼 클래스 변수를 기본 타입 변수로 가져오는 것을 "언박싱" 이라고 일컫음
//        기본 타입 | 래퍼 클래스
//        byte       Byte
//        short      Short
//        int        Integer
//        long       Long
//        float      Float
//        double     Double
//        char       Character
//        boolean    Boolean

//        박싱
//        Integer 래퍼 클래스 num 에 21의 값을 저장
        int num = 21;
        Integer boxingNum = new Integer(num);
        System.out.println((boxingNum));

//        굳이 래퍼 클래스를 사용하는 이유
//        클래스는 객체지향 언어인 Java의 핵심기능이며 객체로 관리하면 객체지향의 많은 기능들을 사용 가능
    }
}
