package basic100._p11;

import java.util.Scanner;

/*
    입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
    1   2   3   4
    8   7   6   5
    9   10  11  12
    16  15  14  13
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 N을 입력하세요. : ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0) {
                    System.out.printf("%-4d", (i * N) + (j + 1));
                } else {
                    System.out.printf("%-4d", (i + 1) * N - j);
                }

            }
            System.out.println();
        }
    }

}
