package basic100._p25;

import java.util.*;


/*
    N이 주어졌을 N의 싸이의 길이를 구하시오
    입력 : 26
    출력 : 4
    26 -> 2+6=8 -> 68 6+8=14 -> 84 8+4=12 -> 42 4+2=6 -> 26
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int num = N;
        int tmp = 0;
        int count = 0;
        do {
            tmp = num % 10 + num / 10;
            tmp = num % 10 * 10 + tmp % 10;
            count = count + 1;
            num = tmp;
            if (tmp == N) {
                break;
            }
        } while (true);
        System.out.println(count);
    }

}
