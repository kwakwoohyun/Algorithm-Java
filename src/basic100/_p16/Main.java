package basic100._p16;

/*
    다음 입력 n을 받아 *을 출력하시오
    입력 : n
:    *
    **
    ***
    ****
    *****
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
