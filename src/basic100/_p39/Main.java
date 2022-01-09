package basic100._p39;

import java.util.*;

/*
    정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다.
    합을 나타낼 때는 수를 1개이상 사용해야 한다.
    1 + 1 + 1 + 1
    1 + 1 + 2
    1 + 2 + 1
    2 + 1 + 1
    2 + 2
    1 + 3
    3 + 1
    정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작.

    입력 : 4
          7
          10
    출력 : 7
          44
          274
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dp = new int[20];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
//        1을 1,2,3의 합으로 나타내는 방법의 수는 1
//        2를 1,2,3의 합으로 나타내는 방법의 수는 2
//        3를 1,2,3의 합으로 나타내는 방법의 수는 4
//        dp[n] = dp[n-1] + dp[n-2] + dp[b-3] 이라는 공식이 나온다.
        for (int i = 4; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        System.out.println(dp[n]);
    }

}
