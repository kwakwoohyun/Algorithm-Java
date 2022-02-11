package P1_BaekjoonGreedy;

import java.util.*;

/**
 * 5와 6의 차이
 * <p>
 * 상근이가 숫자 5를 볼 때, 5로 볼 때도 있지만, 6으로 잘못 볼 수도 있고, 6을 볼 때는, 6으로 볼 때도 있지만, 5로 잘못 볼 수도 있다.
 * 두 수 A와 B가 주어졌을 때, 상근이는 이 두 수를 더하려고 한다. 이때, 상근이가 구할 수 있는 두 수의 가능한 합 중, 최솟값과 최댓값을 구해 출력하는 프로그램을 작성하시오.
 * <p>
 * 입력 :
 * 첫째 줄에 두 정수 A와 B가 주어진다. (1 <= A,B <= 1,000,000)
 * <p>
 * 출력 :
 * 첫째 줄에 상근이가 구할 수 있는 두 수의 합 중 최솟값과 최댓값을 출력한다.
 * <p>
 * 예제 입력1 :
 * 11 25
 * 예제 출력1 :
 * 36 37
 * <p>
 * 예제 입력2 :
 * 1430 4862
 * 예제 출력2 :
 * 6282 6292
 * <p>
 * 예제 입력3 :
 * 16796 58786
 * 예제 출력3 :
 * 74580 85582
 */
public class P_2864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String[] A = input[0].split("");
        String[] B = input[1].split("");
        System.out.print(toMin(A) + toMin(B) + " ");
        System.out.print(toMax(A) + toMax(B));
    }

    public static int toMax(String[] num) {
        String number = "";
        for (int i = 0; i < num.length; i++) {
            if (Integer.parseInt(num[i]) == 5) {
                num[i] = "6";
            }
            number = number.concat(num[i]);
        }
        return Integer.parseInt(number);
    }

    public static int toMin(String[] num) {
        String number = "";
        for (int i = 0; i < num.length; i++) {
            if (Integer.parseInt(num[i]) == 6) {
                num[i] = "5";
            }
            number = number.concat(num[i]);
        }
        return Integer.parseInt(number);
    }
}
