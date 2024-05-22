package collection;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
//        linked list
//        메모리에 남는 공간을 요청해서 여기 저기 나누어서 실제 값을 담아놓는다.
//        실제 값이 있는 주소값으로 목록을 구성하고 저장하는 자료구조

//        기본 기능 -> ArrayList와 동일
//        값을 나누어담기 때문에 조회하는 속도가 느린 단점이 있다.
//        대신에 값을 추가하거나 삭제할 때는 속도가 훨씬 빠르다.
//        왜냐하면 순서가 있는 배열은 값을 추가하거나 삭제할 때마다 그 때 그 때 배열의 순서들을 보정해주어야 한다.

//        선언 방법
        LinkedList<Integer> linkedList = new LinkedList<>();

//        값 추가
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println(linkedList.toString()); // [1, 2, 3]

        linkedList.add(200);
        System.out.println(linkedList.toString()); // [1, 2, 3, 200]

//        특정 인덱스 값 뒤에 추가
        linkedList.add(2,4);
        System.out.println(linkedList.toString()); // [1, 2, 4, 3, 200]

//        특정 인덱스 값 수정
        linkedList.set(1,30);
        System.out.println(linkedList.toString()); // [1, 30, 4, 3, 200]

        linkedList.remove(1);
        System.out.println(linkedList.toString()); // [1, 4, 3, 200]

        linkedList.clear();
        System.out.println(linkedList.toString()); // []
    }
}
