package condition;

public class For {
    public static void main(String[] args) {
//        for문
//        (초기값, 조건문, 증가연산)
        for(int i=0; i<4; i++){
            System.out.println(i);
        }

//        형상된 for문
        int[] numbers = {3,6,9,12,15};
        for(int number:numbers){
            System.out.println(number); // 3, 6, 9, 12, 15
        }

//        2중 for문
        for(int i=2; i<3; i++){
            for(int k=1; k<=9; k++){
                System.out.println(i*k); // 2, 4, 6, 8, 10, 12, 14, 16, 18
            }
        }
    }
}
