package basic100._p28;

import java.util.*;

/*
    입력받은 10진수를 n진수로 변환
    입력 : 19 16
    출력 : 13
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int input = scanner.nextInt();

//        Integer 라이브러리 사용
        if (input == 2) {
            System.out.println(Integer.toBinaryString(num));
        } else if (input == 8) {
            System.out.println(Integer.toOctalString(num));
        } else if (input == 16) {
            System.out.println(Integer.toHexString(num));
        }

//        그냥 풀기
//        while (num > input) {
//
//        }
    }

}
