package basic100._p19;

import java.util.Scanner;

/*
    다음 입력 n의 m승의 결과를 출력하시오
    입력 : 5 3
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
//        Math 함수
        System.out.println((int) Math.pow(n, m));
//        for문
        int result = 1;
        for (int i = 0; i < m; i++) {
            result *= n;
        }
        System.out.println(result);
    }

}
