// Main 클래스
// public 공공의 접근 제어자
public class Main {

//    JDK
//    (1) compiler : .java -> .class (.java 파일을 .class 파일로 변환하는 컴파일러 역할을 가지고 있다.)
//    (2) JRE 런타임 환경을 가지고 있다.
//    (3) JDB 디버깅 (버그를 없애기 위해 면밀히 살피는 과정)


//    main 메소드
//    자바 프로젝트(앱)는, 제일 먼저 Main 클래스의 main 메소드를 실행시킨다.
//    JVM의 약속
//    리액트의 index root에서 App.jsx를 실행시키는 것과 유사하다.

//    static : 이 프로그램이 실행될 때 무조건 실행 (IIFE와 유사)

//    void : 메서드의 출력값 데이터 타입 정의 (아무것도 없다.) (output 정의)
//    타입스크립트의 함수에서 return 값을 정의하는 것과 유사

//    String[] args : 매개변수 자리
//    main 메서드를 호출할 때 input을 무엇으로 하고 타입은 무엇으로 할지 결정 (input 정의)
    public static void main(String[] args) {

//        객체 : 특징(속성, 변수), 행동(메서드)
//        Sysmtem 하위의 메서드에서 out.println 으로 문자열을 출력하도록 도와줌 (DOM,BOM과 유사)
//        print -> 줄바꿈 X
//        println -> 줄바꿈 o
//        ln -> line의 약자
        System.out.println("Hello world!");
        System.out.println(7);
        System.out.println(3);
        System.out.println("Java");
    }
}