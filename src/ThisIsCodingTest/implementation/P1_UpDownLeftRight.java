package ThisIsCodingTest.implementation;

import java.util.*;

/**
 * 상하좌우
 * <p>
 * 여행가 A는 N*N 크기의 정사격형 공간 위에 서 있다. 이 공간은 1*1 크기의 정사각형으로 나누어져 있다.
 * 가장 왼쪽 위 좌표는 (1,1)이며, 가장 오른쪽 아래 좌표는 (N,N)에 해당된다.
 * 여행가 A는 상, 하, 좌, 우 방향으로 이동할 수 있으며, 시작 좌표는 항상 (1,1)이다.
 * 우리 앞에는 여행가 A가 이동할 계획이 적힌 계획서가 놓여 있다.
 * <p>
 * 계획서에는 하나의 줄에 띄어쓰기를 기준으로 하여 L, R, U, D 중 하나의 문자가 반복적으로 적혀 있다.
 * 각 문자의 의미는 다음과 같다.
 * L : 왼쪽으로 한 칸 이동
 * R : 오른쪽으로 한 칸 이동
 * U : 위로 한 칸 이동
 * D : 아래로 한 칸 이동
 * <p>
 * 이 때 여행가 A가 N*N 크기의 정사각형 공간을 벗어나는 움직임은 무시된다.
 * 예를 들어 (1,1)의 위치에서 L 혹은 U를 만나면 무시된다.
 * <p>
 * 입력 조건 :
 * 첫째 줄에 공간의 크기를 나타내는 N이 주어진다.(1<=N<=100)
 * 둘째 줄에 여행가 A가 이동할 계획서 내용이 주어진다.(1<=이동횟수<=100)
 * <p>
 * 출력 조건 :
 * 첫째 줄에 여행가 A가 최종적으로 도착할 지점의 좌표 (X,Y)를 공백을 기준으로 구분하여 출력한다.
 * <p>
 * 이 문제는 요구사항대로 충실히 구현하면 되는 문제이다.
 * 일련의 명령에 따라서 개체를 차례대로 이동시킨다는 점에서 시뮬레이션(Simulation) 유형으로도 분류되며,
 * 구현이 중요한 대표적 문제 유형이다.
 * 다만, 알고리즘 교재나 문제 풀이 사이트에 따라서 다르게 일컬을 수 있으므로,
 * 코딩 테스트에서의 시뮬레이션 유형, 구현 유형, 완전 탐색 유형은 서로 유사한 점이 많다는 정도로만 기억한다.
 */
public class P1_UpDownLeftRight {
    public static void main(String[] args) {
        /**
         * 내풀이
         */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] plan = scanner.nextLine().split(" ");
//        동 북 서 남 순서대로 x, y가 움직이는 배열
        int[] dx = {0, -1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        int x = 1;
        int y = 1;
        for (int i = 0; i < plan.length; i++) {
            if (plan[i].equals("R") && x < N) {
                y = y + dy[0];
            } else if (plan[i].equals("U") && x != 1) {
                x = x + dx[1];
            } else if (plan[i].equals("L") && y != 1) {
                y = y + dy[2];
            } else if (plan[i].equals("D") && x < N) {
                x = x + dx[3];
            }
        }
        System.out.println(x + " " + y);
        /**
         * 유튜브 풀이
         */
//        N을 입력 받기
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] plans = scanner.nextLine().split(" ");
        int xx = 1, yy = 1;
//        L, R, U, D에 따른 이동 방향
        int[] dxx = {0, 0, -1, 1};
        int[] dyy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};
//        이동 계획을 하나씩 확인
        for (int i = 0; i < plans.length; i++) {
            char plann = plans[i].charAt(0);
//            이동 후 좌표 구하기
            int nx = -1, ny = -1;
            for (int j = 0; j < 4; j++) {
                if (plann == moveTypes[j]) {
                    nx = xx + dxx[j];
                    ny = yy + dyy[j];
                }
            }
//            공간을 벗어나는 경우 무시
            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
//            이동 수행
            xx = nx;
            yy = ny;
        }
        System.out.println(x + " " + y);
    }
}
