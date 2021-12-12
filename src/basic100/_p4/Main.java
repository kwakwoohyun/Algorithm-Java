package basic100._p4;

import java.util.Arrays;
import java.util.Scanner;

/*
    10진수를 2진수로 변환
 */
public class Main {

    public static void main(String[] args) {
//        첫번재 방법
        Scanner scanner = new Scanner(System.in);
        System.out.println("10진수를 입력하세요");
        int num = scanner.nextInt();
        int i = 0;
        int result[] = new int[10];
        while (num > 0) {
            result[i] = num % 2;
            num = num / 2;
            i++;
            if (num == 0) {
                i--;
            }
        }
        for (; i >= 0; i--) {
            System.out.print(result[i]);
        }
        System.out.println();
//        2번째 방법
        System.out.println("10진수를 입력하세요");
        int num2 = scanner.nextInt();
        System.out.println(Integer.toBinaryString(num2));
    }

}
