package variable;

public class Operation {

    public static void main(String[] args) {
//        산술연산자 : +, -, *, /, %, <<, >> (비트 연산)
        int x = 5;
        int y = 10;
        int z = x + y; // x,y = 피연산자, + = 연산자
        System.out.println(z); // 15

//        비교연산자 : >, <, >=, <=, ==, !=
        int a = 20;
        int b = 20;
        System.out.println(a==b); // true

//        논리연산자 : &&(true), ||(false), !(not)
        boolean myBool = false;
        if(!myBool) System.out.println("mybool is false");

//        대입연산자 : =, ++, --
        int myNum = 1;
        System.out.println(myNum++); // 1
        int myNum2 = 1;
        System.out.println(++myNum2); // 2

//        기타연산자 : (type), ? :, instance of
    }
}
