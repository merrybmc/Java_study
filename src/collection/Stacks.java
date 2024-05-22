package collection;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
//        Stack
//        수직으로 값을 쌓았다가 넣었다가 다시 뺀다. FIFO(Basket)
//        method : push, pop, peek
//        최근 저장된 데이터를 순서대로 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 주로 사용

//        선언 방법
        Stack<Integer> intStack = new Stack<Integer>();

//        값 추가
        intStack.push(1); // [1]
        intStack.push(2); // [1, 2]
        intStack.push(3); // [1, 2, 3]

        System.out.println(intStack.toString()); // [1, 2, 3]

//        값 삭제
//        값이 없을 때까지 순회
        while (!intStack.isEmpty()){
            System.out.println(intStack.pop()); // 제일 마지막으로 들어간 값 순서대로 삭제 3, 2, 1
        }

        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

//        제일 마지막으로 들어간 값 출력
        System.out.println(intStack.peek());

//        배열의 크기 출력 == length
        System.out.println(intStack.size());
    }
}
