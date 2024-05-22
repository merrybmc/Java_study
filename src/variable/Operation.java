package variable;

public class Operation {

    public static void main(String[] args) {
//        산술연산자 : +, -, *, /, %, <<, >> (비트 연산)
//        산술 연산자의 타입 일치
//        - 두 피연산자의 타입을 같게 일치시킨다. (둘중에 저장공간이 크기가 더 큰 타입으로 일치)
//        - 피연산자의 타입이 `int`보다 작은 `short` 타입이면 `int`로 변환
//        - `long` 보다 작은 `int`, `short` 타입이면 `Long` 으로 변환
//        - `float` 보다 작은 `long`, `int`, `short` 타입이면 `float` 으로 변환
//        - `double` 보다 작은 `float`, `long`, `int`, `short` 타입이면 `double`으로 변환
//        - 이처럼 변수 여러 개를 연산했을 때 결과값은 피연산자 중 표현 범위가 가장 큰 변수 타입을 가지게 된다.
        int x = 5;
        int y = 10;
        int z = x + y; // x,y = 피연산자, + = 연산자
        System.out.println(z); // 15

        short sx = 10;
        int sy = 20;

        int sz = sx + sy;

        long lx = 30L;
        long lz = z + lx;

        float fx = x;
        float fy = y;
        float fz = z;

        System.out.println(sz);
        System.out.println(lz);
        System.out.println(fz);

//        비트 연산자
//        - Byte를 8등분한게 Bit
//        - Bit는 0,1 둘 중 하나의 값만을 저장하는 컴퓨터가 표현가능한 가장 작은 단위
//        - 컴퓨터의 가장 작은 단위인 Bit이기 때문에 연산중에서 Bit 연산이 제일 빠름
//        - 물론 이전에 배운대로 0,1 값으로 산술 연산을 하거나, 비교 연산을 할 수 있지만 비트 연산을 통해 자리수를 옮길 수도 있음
//        - 이처럼 Bit의 자리수를 옮기는 것을 비트 연산이라 일컫음
//        - `<<` (왼쪽으로 자리수 옮기기), `>>` (오른쪽으로 자리수 옮기기)
//        - 0,1은 2진수 값이기 때문에,
//        - 자리수를 왼쪽으로 옮기는 횟수만큼 2의 배수로 곱셈이 연산되는것과 동일
//        - 자리수를 오른쪽으로 옮기는 횟수만큼 2의 배수로 나눗셈이 연산되는것과 동일
        System.out.println(3<<2); // 12 (1100 -> 8+4)
        System.out.println(3<<1); // 6 (110 -> 4+2)

//        비교연산자 : >, <, >=, <=, ==, !=
        int a = 20;
        int b = 20;
        System.out.println(a==b); // true

//        논리연산자 : &&(true), ||(false), !(not)
        boolean myBool = false;
        if(!myBool) System.out.println("mybool is false");

        int a2 = 2;
        int b2 = 9;

        boolean result = x < y && y < z; // true && true

//        대입연산자 : =, ++, --
        int myNum = 1;
        System.out.println(myNum++); // 1
        int myNum2 = 1;
        System.out.println(++myNum2); // 2

//        기타연산자 : (type), ? :, instance of
//        (type) 형변환 연산자
        int intNumber = 93 + (int)98.8; // 0.8은 제외
        System.out.println(intNumber); // 191

//        삼항연산자 ? :
        int x2 = 1;
        int y2 = 9;
        System.out.println(x2>y2 ? "true" : "false"); // false

//        instance of
//        피 연산자가 조건에 명시된 클래스의 객체인지 비교하여 맞으면 true, 틀리면 false 출력

//        연산자 우선 순위 : 산술 > 비교 > 논리 > 대입
//        - 연산자 여러개가 함께 있는 연산을 계산할 때는 우선순위가 있다.
//        - 위 우선순위에 따라서 최종적인 응답값이 결정된다.
//        - 단, 괄호로 감싸주면 괄호안의 연산이 최우선순위로 계산된다.


    }
}
