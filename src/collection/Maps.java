package collection;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
//        Map : key -> value pair 중요
//        key라는 값을 통해 unique하게 보장되어야 한다. key 값 중복허용 X
//        Map -> HashMap, TreeMap으로 응용 가능하다.

//        선언 방법
        Map<String,Integer> intMap = new HashMap<>();

//        값 추가
        intMap.put("1",11); // {1=11}
        intMap.put("1",12); // {1=12}
        intMap.put("2",21); // {1=12, 2=21}
        intMap.put("2",22); // {1=12, 2=22}
        intMap.put("3",31); // {1=12, 2=22, 3=31}
        intMap.put("3",32); // {1=12, 2=22, 3=32}

        //        key 값 출력
        System.out.println(intMap.toString()); // {1=1, 2=2, 3=3}
        System.out.println(intMap.keySet()); // [1, 2, 3]
        System.out.println(intMap.values()); // [12, 22, 32]

//        향상된 for문으로 조회
//        keySet() : key 값만 순회
        for(String key: intMap.keySet()){
            System.out.println(key); // 1, 2, 3
        }

//        values() : value 값만 순회
        for(Integer value: intMap.values()){
            System.out.println(value);
        }

//        get : 특정 key 값 조회
        System.out.println(intMap.get("1")); // 12
    }
}
