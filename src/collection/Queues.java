package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
//        Queue : FIFO (먼저 들어간게 먼저 나오는 자료구조)
//        method : add, peek, poll
//        생성자가 없는 인터페이스이다.

//        선언 방법
//        Queue는 생성자가 없기 때문에 LinkedList로 만들어주어야 한다.
        Queue<Integer> intQueue = new LinkedList<Integer>();

//        값 추가
        intQueue.add(1); // [1]
        intQueue.add(2); // [1, 2]
        intQueue.add(3); // [1, 2, 3]

        System.out.println(intQueue.toString()); // [1, 2, 3]

//        값 삭제
        while (!intQueue.isEmpty()){
            System.out.println(intQueue.poll()); // stack과 다르게 1,2,3 먼저 들어간 순으로 삭제
        }

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(3);

//        stack과 다르게 제일 먼저 들어간 값 조회
        System.out.println(intQueue.peek()); // 1

//        배열 크기 조회
        System.out.println(intQueue.size());

    }
}
