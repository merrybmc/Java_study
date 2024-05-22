package variable;

import java.util.Arrays;

public class Duplication {
    public static void main(String[] args) {
//        얕은 복사
//        배열은 참조형 변수이며 실제 값이 아닌 실제 값의 주소값을 가짐
//        이렇게 주소값만 복사되고 실제값은 1개로 유지되는걸 얕은 복사라고 일컫음
//        주소값만 복사된다는 말은 변수명은 서로 다르지만 같은 값의 주소를 보고 있다는 것

        int[] a = {1, 2, 3, 4};
        int[] b = a; // 얕은 복사

        System.out.println(b[0]); // 1

        b[0] = 3;

        System.out.println(a[0]); // 3, a 배열의 0번째 값도 3으로 출력됨

//        깊은 복사
//        얕은 복사처럼 가짜 복사가 아닌 진짜 새로운 배열을 똑같이 만들고 싶을 때 깊은 복사를 함
//        깊은 복사는 결국 실제 값을 가지고 있는 배열의 기본형 값을 꺼내서 복사

        int[] x = {1, 2, 3, 4};
        int[] y = new int[x.length];

        for(int i=0; i<x.length;i++) {
            y[i] = x[i]; // 깊은 복사
            System.out.println(y[i]);
        }

        y[0] = 3;

        System.out.println(x[0]); // 1로 출력

//        간단한 깊은 복사
//        1. clone
//        단점 : 2차원 배열에서는 얕은 복사로 작동

        int[] a2 = {1, 2, 3, 4};
        int[] b2 = a.clone();

//        2. Arrays.copyOf()

        int[] a3 = {1, 2, 3, 4};
        int[] b3 = Arrays.copyOf(a3, a3.length); // 배열과 함께 length값도 넣어줌
        }
    }

