package basic100._p35;

import java.util.*;

/*
    입력된 수를 높은 자릿수 부터 출력하시오 (재귀)
    입력 : 2312
    출력 : 2
          3
          1
          2
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        print(input);
    }

    public static void print(int num) {
        if (num / 10 == 0) {
            System.out.println(num);
            return;
        }
        print(num / 10);
        System.out.println(num % 10);
    }
}
