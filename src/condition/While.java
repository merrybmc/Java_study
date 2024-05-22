package condition;

public class While {
    public static void main(String[] args) {

//        while
        int number = 0;
//        조건을 만족할 때까지 반복
        while(number < 3) {
            number++;
            System.out.println(number);
        }

//        do - while
        int number2 = 4;
        do{
//            조건전에 로직을 먼저 수행
            System.out.println(number2); // 4가 출력됨
        }while (number2 < 3);

        //    break
        int number3 = 0;

        while (number3 < 3) {
            number3++;
            if (number3==2) {
                break; // while문 탈출
            }
            System.out.println(number3); // 1
        }

        for(int i=0; i<4; i++){
            if(i==3){
                break;
            }
            System.out.println(i); // 1, 2
        }
    }
}
