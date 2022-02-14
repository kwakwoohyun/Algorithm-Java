package P1_BaekjoonGreedy;

import java.util.*;

/**
 * 피로도
 * <p>
 * 하루에 한 시간 단위로 일을 하거나 일을 쉬어도 된다. 하루에 한 시간 일하면 피로도는 A만큼 쌓이고 일은 B만큼 처리할 수 있다.
 * 만약에 한 시간을 쉰다면 피로도는 C만큼 줄어든다. 단, 피로도가 음수로 내려가면 0으로 바뀐다. 당연히 일을 하지 않고 쉬었기 때문에 처리한 일은 없다.
 * 피로도를 최대한 M을 넘지 않게 일을 하려고 한다. M를 넘기면 일하는데 번아웃이 와서 이미 했던 일들도 다 던져버리고 일을 그만두게 된다.
 * 번아웃이 되지 않도록 일을 할때 하루에 최대 얼마나 일을 할 수 있는지 구해보자. 하루는 24시간이다.
 * <p>
 * 입력 :
 * 첫 번째 줄에 네 정수 A, B, C, M이 공백으로 구분되어 주어진다.
 * 맨 처음 피로도는 0이다.
 * <p>
 * 출력 :
 * 하루에 번 아웃이 되지 않도록 일을 할 때 최대 얼마나 많은 일을 할 수 있는지 출력한다.
 * <p>
 * 제한 :
 * 1<=A<=1,000,000
 * 1<=B<=10,000
 * 1<=C<=10,000
 * 1<=M<=1,000,000
 * <p>
 * 예제 입력1 :
 * 5 3 2 10
 * 예제 출력1 :
 * 24
 * <p>
 * 예제 입력2 :
 * 10 5 1 10
 * 예제 출력2 :
 * 15
 * <p>
 * 예제 입력3 :
 * 11 5 1 10
 * 예제 출력3 :
 * 0
 */
public class P_22864 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int M = scanner.nextInt();
        int work = 0;
        int fatigue = 0;

        for (int i = 0; i < 24; i++) {
            if (fatigue + A > M) {
                fatigue = fatigue - C;
                fatigue = Math.max(0, fatigue);
            } else {
                fatigue = fatigue + A;
                work = work + B;
            }
        }
        System.out.println(work);
    }
}
