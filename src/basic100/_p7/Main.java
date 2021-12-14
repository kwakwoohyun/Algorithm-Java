package basic100._p7;

import java.util.Scanner;

/*
    입력된 수가 소수인지 판별
    소수란 : 약수가 1과 자기 자신뿐 (단 1보다 큰 자연수)
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean primeNumber = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primeNumber = false;
                break;
            }
        }
        if (primeNumber) {
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }

}
