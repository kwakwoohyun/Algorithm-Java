package basic100._p10;

import java.util.Scanner;

/*
    입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오
    1   2   3   4
    5   6   7   8
    9   10  11  12
    13  14  15  16
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int startNumber = 1;
        System.out.println("숫자 N을 입력하세요. : ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
//                System.out.printf("%-4d", startNumber);
                System.out.printf("%-4d", (N * i) + j + 1);
//                startNumber++;
            }
            System.out.println();
        }
    }
}
