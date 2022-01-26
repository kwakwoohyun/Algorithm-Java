package ThisIsCodingTest.implementation;

import java.util.*;

/**
 * 시각
 * <p>
 * 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성
 * 예를 들어 1을 입력했을 때 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각이다.
 * 00시 00분 03초
 * 00시 13분 30초
 * 반면에 다음은 3이 하나도 포함되어 있지 않으므로 세면 안 되는 시각이다.
 * 00시 02분 55초
 * 01시 27분 45초
 * <p>
 * 입력 조건 :
 * 첫째 줄에 정수 N이 입력된다.(0<=N<=23)
 * <p>
 * 출력 조건 :
 * 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서 3이 하나라도 포함되는 모든 경우의 수를 출력한다.
 * <p>
 * 입력 예시 :
 * 5
 * 출력 예시 :
 * 11475
 * <p>
 * 이 문제는 가능한 모든 시각의 경우를 하나씩 모두 세서 풀 수 있는 문제이다.
 * 하루는 86,400초이므로 00시 00분 00초부터 23시 59분 59초까지의 모든 경우는 86,400가지이다.
 * 24 * 60 * 60 = 86,400
 * 따라서 단순히 시각을 1씩 증가시키며 3이 하나라도 포함되어 있는지 확인하면 된다.
 * 이러한 유형은 완전 탐색(Brute Forcing)문제 유형이라고 불린다.
 * 가능한 경우의 수를 모두 검사해보는 탐색 방법을 의미힌다.
 */
public class P2_Time {
    public static void main(String[] args) {
        /**
         * 내 풀이
         */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        for (int h = 0; h <= N; h++) {
            for (int m = 0; m < 60; m++) {
                for (int s = 0; s < 60; s++) {
                    if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
                        count = count + 1;
                    }
                }
            }
        }
        System.out.println(count);
        /**
         * 유튜브 풀이
         */
        int h = scanner.nextInt();
        int cnt = 0;
        for (int i = 0; i <= h; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i, j, k)) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    public static boolean check(int i, int j, int k) {
        if (i % 10 == 3 || j / 10 == 3 || j % 10 == 3 || k / 10 == 3 || k % 10 == 3) {
            return true;
        }
        return false;
    }
}
