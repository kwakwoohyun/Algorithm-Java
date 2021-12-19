package basic100._p15;

import java.util.Scanner;

/*
    구구단 시작 s부터 f단까지 입력받아 출력
    입력 : 2 3
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int s = Integer.parseInt(input[0]);
        int f = Integer.parseInt(input[1]);
        for (int i = 1; i < 10; i++) {
            for (int j = s; j <= f; j++) {
                System.out.printf("%d * %d = %d   ", j, i, j * i);
            }
            System.out.println();
        }
    }

}
