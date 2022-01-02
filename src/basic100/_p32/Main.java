package basic100._p32;

import java.util.*;

/*
    입력된 두 수 까지의 합을 구하시오 (재귀)
    입력 : 1 4
    출력 : 10
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(plus(start, end));
    }

    public static int plus(int num, int end) {
        if (num == end) {
            return num;
        }
        return num + plus(num + 1, end);
    }

}
