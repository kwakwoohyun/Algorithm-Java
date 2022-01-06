package basic100._p36;

import java.util.*;

/*
    이진수 변환 (재귀)
    입력 : 17
    출력 : 10001
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        binary(input);
    }

    public static void binary(int num) {
        if (num == 1) {
            System.out.print(1);
            return ;
        }
        binary(num / 2);
        System.out.print(num % 2);
    }

}
