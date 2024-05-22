package variable;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        선언 방법
//        1. 타입[] 변수
//        ex. int[] intArray;
//        2. 타입 변수[]
//        ex. int intArray[]; 타입스크립트와 유사

//        배열은 참조형 변수들처럼 new 명령어를 통해서 생성
//        대괄호[] 안에서 배열의 크기를 지정

//        배열 미리 생성
        int[] intArray = new int[3]; // {0, 0, 0}
        boolean[] boolArray = new boolean[3]; // {false, false, false}
        String[] stringArray = new String[3]; // {"", "", ""}

//        배얼 선언 후 초기화
        int[] intArray2;
        intArray2 = new int[3];

//        생성한 배열을 '순회' -> 배열의 값을 하나씩 뽑아서 조회
//        (1) 단건 조회
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);

//        (2) 다건 조회
        for(int i=0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }

//        배열 선언 및 할당
        int[] intArray3 = {1,2,3,4,5};
        String[] stringArray2 = {"a","b","c","d","e"};
        System.out.println(intArray3[0]); // 1

//        배열 값 초기화
        Arrays.fill(intArray3,0); // {0, 0, 0, 0, 0}
        System.out.println(intArray3[0]); // 0
    }
}
