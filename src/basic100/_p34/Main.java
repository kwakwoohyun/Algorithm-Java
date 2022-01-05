package basic100._p34;

import java.util.*;

/*
    입력된 항의 피보나치 수를 구하라 (재귀)
    입력 : 6
    출력 : 8 (1->1->2->3->5->8)
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[] array = new int[100];
        for (int i = 0; i < input; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
        System.out.println(fibonacci(input));
    }

    public static int fibonacci(int num) {
        if (num <= 1) {
            return 1;
        }
        return fibonacci(num - 2) + fibonacci(num - 1);
    }
}
