package P1_BaekjoonGreedy;

import java.util.*;

/**
 * 캥거루 세마리2
 * <p>
 * 캥거루 세 마리가 사막에서 놀고 있다. 사막에는 수직선이 하나 있고, 캥거루는 서로 다른 한 좌표 위에 있다.
 * 한 번 움직일 때, 바깥쪽의 두 캥거루 중 한 마리가 다른 두 캥거루 사이의 정수 좌표로 점프한다.
 * 한 좌표 위에 있는 캥거루가 두 마리 이상일 수는 없다.
 * 캥거루는 최대 몇 번 움직일 수 있을까?
 * <p>
 * 입력 :
 * 여러개의 테스트 케이스로 이루어져 있으며, 세 캥거루의 초기 위치 A, B, C 가 주어진다.(0<A<B<C<100)
 * <p>
 * 출력 :
 * 각 테스트에 대해 캥거루가 최대 몇 번 움직일 수 있는지 출력한다.
 * <p>
 * 예제 입력 :
 * 2 3 5
 * 3 5 9
 * <p>
 * 예제 출력 :
 * 1
 * 3
 */
public class P_11034 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String[] abc = scanner.nextLine().split(" ");
            int A = Integer.parseInt(abc[0]);
            int B = Integer.parseInt(abc[1]);
            int C = Integer.parseInt(abc[2]);
            int AB = B - A - 1;
            int CB = C - B - 1;
            System.out.println(Math.max(AB, CB));
        }
    }
}
