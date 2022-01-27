package ThisIsCodingTest.greedy;

import java.util.*;

/**
 * 1이 될때까지
 * <p>
 * 어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 한다.
 * 단, 두번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있다.
 * <p>
 * 1. N에서 1을 뺀다.
 * 2. N을 K로 나눈다.
 * <p>
 * 예를들어 N이 17, K가 4라고 가정한다. 이 때 1번의 과정을 한 번 수행하면 N은 16이 된다.
 * 이후에 2번의 과정을 두 번 수행하면 N은 1이된다. 결과적으로 이 경우 전체 과정을 실행한 횟수는 3이 된다.
 * 이는 N을 1로 만드는 최소 횟수이다.
 * <p>
 * N과 K가 주어질 때 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 최소 횟수를 구하는 프로그램을 작성해라.
 * <p>
 * 입력 조건 :
 * 첫째 줄에 N(1<=N<=100.000)과 K(2<=K<=100,000)가 공백을 기준으로 하여 각각 자연수로 주어진다.
 * <p>
 * 출력 조건 :
 * 첫째 줄에 N이 1이 될 때까지 1번 혹은 2번의 과정을 수행해야 하는 횟수의 최솟값을 출력한다.
 * <p>
 * 입력 예시 :
 * 25 5
 * 출력 예시 :
 * 2
 * <p>
 * 풀이
 * 주어진 N에 대하여 최대한 많이 나누기를 수행한다.
 * N의 값을 줄일 때 2 이상의 수로 나누는 작업이 1을 빼는 작업보다 수를 훨씬 많이 줄일 수 있다.
 * 가능하면 최대한 많이 아누는 작업이 최적의 해를 항상 보장할 수 있을까?
 * N이 아무리 큰 수여도, K로 계속 나눈다면 빠르게 줄일 수 있따.
 * 다시 말해 K가 2이상이기만 하면, K로 나누는 것이 1을 빼는 것보다 항상 빠르게 N을 줄일 수 있다.
 */
public class P2_Until1 {

    public static void main(String[] args) {
        /**
         * 내 풀이
         */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int count = 0;
        while (N != 1) {
            if (N % K == 0) {
                N = N / K;
                count = count + 1;
            } else {
                N = N - 1;
                count = count + 1;
            }
        }
        System.out.println(count);
        /**
         * 유튜브 풀이
         */
        N = scanner.nextInt();
        K = scanner.nextInt();
        int result = 0;
        while (true) {
            int target = (N / K) * K; // N이 K로 나누어 떨어지는 수가 될때까지 빼기
            result = result + (N - target);
            N = target;
            if (N < K) {
                break;
            }
            result = result + 1;
            N = N / K;
        }
        result = result + (N - 1);
        System.out.println(result);
    }

}
