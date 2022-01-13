package basic100._p41;

import java.util.*;

/*
    RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다.
    또한, 그들은 모든 이웃집은 같은 색으로 칠할 수 없다는 규칙도 정했다.
    집 i의 이웃은 집 i-1과 집 i+1이고, 첫 집과 마지막 집은 이웃이 아니다.
    각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용,
    파랑으로 드는 비용이 주어질 때, 모든 집을 칠하는 비용의 최솟값을 구하는 프로그램을 작성해라

    입력 : 첫째 줄에 집의 수 N이 주어진다. N은 1000보다 작거나 같다.
    둘째 줄부터 N개의 줄에 각 집을 빨강으로, 초록으로, 파랑으로 칠하는 비용이 주어진다.
    비용은 1000보다 작거나 같은 자연수이다.
    출력 : 첫째 줄에 모든 집을 칠하는 비용의 최소값을 출력한다.

    예제 입력 : 3
              26 40 83
              49 60 57
              13 89 99
    26 + 57 + 13
    (1,0) (1,1) (1,2)
    (2,0) (2,1) (2,2)
    (3,0) (3,1) (3,2)
    예제 출력 : 96

    각 집의 최솟값을 찾아 누적합을 구하는 것이 아닌 모든 경로의 경우의 수를 찾아
    최종적으로 작은 누적합을 찾아야한다.

 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] dp = new int[N + 1][3];

        for (int i = 1; i <= N; i++) {
            int R = scanner.nextInt();
            int G = scanner.nextInt();
            int B = scanner.nextInt();
            dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + R;
            dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + G;
            dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + B;
        }
        System.out.println(Math.min(dp[N][0], Math.min(dp[N][1], dp[N][2])));
    }

}
