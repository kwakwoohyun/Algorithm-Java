package ThisIsCodingTest.greedy;

import java.util.*;

/**
 * 곱하기 혹은 더하기
 * <p>
 * 각 자리가 숫자(0부터 9)로만 이루어진 문자열 S가 주어졌을 때, 왼쪽부터 오른쪽으로 하나씩 모든 숫자를 확인하며
 * 숫자 사이에 'x' 혹은 '+'연산자를 넣어 결과적으로 만들어질 수 있는 가장 큰 수를 구하는 프로그램을 작성해라.
 * 단, +보다 x를 먼저 계산하는 일반적인 방식과는 달리, 모든 연산은 왼쪽에서부터 순서대로 이루어진다고 가정한다.
 * <p>
 * 예를 들어 02984라는 문자열로 만들 수 있는 가장 큰 수는 ((((0 + 2) x 9) x 8) x 4) = 576 이다.
 * 또한 만들어질 수 있는 가장 큰 수는 항상 20억 이하의 정수가 되도록 입력이 주어진다.
 * <p>
 * 내생각
 * 0과 1만 아니면 x가 +보다 무조건 크지 않나?
 * <p>
 * 아이디어
 * 대부분의 경우 +보다는 x가 더 값을 크게 만든다.
 * 다문 두 수 중에서 하나라도 0혹은 1인경우, 곱하기보다는 더하기를 수행하는 것이 효율적이다.
 * 따라서 두 수에 대하여 연상을 수행할 때, 두 수 중에서 하나라도 1이하인 경우에는 더하며,
 * 두 수가 모두 2이상인 경우에는 곱하면 된다.
 */
public class P3_MultiplyOrPlus {
    public static void main(String[] args) {
        /**
         * 내풀이
         */
        Scanner scanner = new Scanner(System.in);
        String[] S = scanner.next().split("");
        int result = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i].equals("0") || S[i].equals("1") || result == 0) {
                result = result + Integer.parseInt(S[i]);
            } else {
                result = result * Integer.parseInt(S[i]);
            }
        }
        System.out.println(result);
        /**
         * 유튜브 풀이
         */
        String s = scanner.next();
        long result2 = s.charAt(0) - '0';
        for (int i = 1; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if (num <= 1 || result2 <= 1) {
                result2 = result2 + num;
            } else {
                result2 = result2 * num;
            }
        }
        System.out.println(result2);
    }
}
