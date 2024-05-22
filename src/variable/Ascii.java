package variable;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//      sc.nextInt();  클라이언트가 넣은 입력한 값을 저장
        int asciiNumber = sc.nextInt();
        char myAsciiChar = (char)asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현된다.

        System.out.println(myAsciiChar);

        char letter = sc.nextLine().charAt(0); // 문자를 숫자로 바꾸는 형변환
        int myAsciiNumber = (int)letter;

        System.out.println(myAsciiNumber);
    }
}
