package basic100._p27;

import java.util.*;


/*
    입력 n에 따른 달팽이 모양의 숫자를 출력
    입력 : 5
    출력 :

 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
//        배열의 자리수
        int x = 0;
        int y = 0;
//        시작 숫자
        int start = 1;
//        몇번 이동할 것인가 : 처음엔 n번 가야하니까
        int k = n;
//        n이 5이면 방향이 9번 바뀌므로 n * 2 - 1 까지
        for (int i = 0; i < n * 2 - 1; i++) {
//            방향이 오른쪽, 아래, 왼쪽, 위 4가지이므로 i % 4에대한 값으로 방향을 정한다.
            switch (i % 4) {
                case 0: // 오른쪽
                    for (int j = 0; j < k; j++) {
                        array[x][y] = start;
                        start++;
                        y++;
                    }
                    y--;
                    x++;
                    k--;
                    break;
                case 1: // 아래
                    for (int j = 0; j < k; j++) {
                        array[x][y] = start;
                        start++;
                        x++;
                    }
                    x--;
                    y--;
                    break;
                case 2: // 왼쪽
                    for (int j = 0; j < k; j++) {
                        array[x][y] = start;
                        start++;
                        y--;
                    }
                    y++;
                    x--;
                    k--;
                    break;
                case 3: // 위
                    for (int j = 0; j < k; j++) {
                        array[x][y] = start;
                        start++;
                        x--;
                    }
                    x++;
                    y++;
                    break;
            }
        }
        System.out.println(Arrays.deepToString(array));
    }

}
