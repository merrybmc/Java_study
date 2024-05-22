package collection;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
//        Set은 순서가 없으며 중복이 없는 집합과 닮아있다.
//        순서가 보장되지 않는 대신 중복을 허용하지 않도록 하는 프로그램에서 사용할 수 있는 자료구조이다.
//        그냥 쓸 수도 있지만 HashSet, TreeSet 등과 으용해서 같이 사용 가능
//        Set은 생성자가 없어서 바로 생성할 수 없다.
//        생성자가 존재하는 HashSet을 이용해서 Set을 구현 가능하다.

//        선언 방법
        Set<Integer> intSet = new HashSet<Integer>();

        intSet.add(1); // [1]
        intSet.add(1); // [1]
        intSet.add(2); // [1, 2]
        intSet.add(2); // [1, 2]
        intSet.add(3); // [1, 2, 3]
        intSet.add(3); // [1, 2, 3]

        System.out.println(intSet.toString()); // [1, 2, 3]

//        contains : 값이 포함되어있는지 확인
        System.out.println(intSet.contains(1)); // true
        System.out.println(intSet.contains(4)); // false
    }
}
