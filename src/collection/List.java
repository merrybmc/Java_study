package collection;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
//        List
//        순서가 있는 데이터의 집합 => Array(최초 길이를 알아야 함)
//        처음에 길이를 몰라도 만들 수 있음
//        1) Array -> 정적 배열 (배열의 크기가 변하지 않는다)
//        2) List(ArrayList) -> 동적 배열 (배열의 크기가 가변적으로 늘어난다)
//        - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다.
//        - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장한다.

//        선언 방법 ArrayList<변수 래퍼타입> 변수명 = new ArrayList<변수 래퍼타입>();
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 변수 선언

//        값 추가
        intList.add(1); // {1}
        intList.add(2); // {1, 2}
        intList.add(3); // {1, 2, 3}

//        값 읽기
//        단건 읽기
        System.out.println(intList.get(0)); // 1
//        전체 읽기
        System.out.println(intList.toString()); // [1, 2, 3]

//        값 수정 (바꿀 인덱스, 바꿀 값)
        System.out.println(intList.get(1)); // 2
        intList.set(1, 10);
        System.out.println(intList.get(1)); // 10

//        값 삭제
        System.out.println(intList.get(2)); // 3
        intList.remove(2);
//        System.out.println(intList.get(2)); // error

//        값 초기화
        intList.clear();
        System.out.println(intList.toString()); // []
    }
}
