package basic100._p30;

import java.util.*;

/*
    입력된 숫자까지 + - 를 차례대로 반복하시오
    입력 : 9
    출력 : 1 + 2 - 3 + 4 - 5 + 6 - 7 + 8 - 9
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            if (i == input - 1) {
                System.out.print(i + 1);
            } else if (i % 2 == 0) {
                System.out.print(i + 1 + " + ");
            } else {
                System.out.print(i + 1 + " - ");
            }
        }
    }
}
