package basic100._p31;

import java.util.*;

/*
    입력된 수의 팩토리얼을 구해라.
    입력 : 5
    출력 : 120
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(factorial(input));
    }

    public static int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

}
