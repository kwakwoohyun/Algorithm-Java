package ThisIsCodingTest.implementation;

import java.util.*;

/**
 * 왕실의 나이트
 * <p>
 * 행복 왕국의 왕실 정원은 체스판과 같은 8x8 좌표 평면이다. 왕실 정원의 특정한 한 칸에 나이트가 서 있다.
 * 나이트는 매우 충성스러운 신하로서 매일 무슬을 연마한다.
 * 나이트는 말을 타고 있기 때문에 이동할 때는 L자 형태로만 이동할 수 있으며, 정원 밖으로는 나갈 수 없다.
 * 나이트는 특정 위치에서 다음과 같은 2가지 경우로 이동할 수 있다.
 * 1. 수평으로 두 칸 이동한 뒤에 수직으로 한 칸 이동하기
 * 2. 수직으로 두 칸 이동한 뒤에 수평으로 한 칸 이동하기
 * <p>
 * 이처럼 8x8 좌표 평면상에서 나이트의 위치가 주어졌을 때 나이트가 이동할 수 있는 경우의 수를 출력하는 프로그램을 작성
 * 왕실의 정원에서 행 위치를 표한할 때는 1부터 8로 표현하며, 열 위치를 표현할때는 a부터 h로 표현한다.
 * <p>
 * c2에 있을 때 이동할 수 있는 경우의 수는 6가지 이다.
 * <p>
 * 입력 조건 :
 * 첫째 줄에 8x8 좌표 평면상에서 현재 나이트가 위치한 곳의 좌표를 나타내는 두 문자로 구성된 문자열이 입력된다.
 * 입력 문자는 a1 처럼 열과 행으로 이루어진다.
 * <p>
 * 출력 조건 :
 * 첫째 줄에 나이트가 이동할 수 있는 경우의 수를 출력
 * <p>
 * 입력 예시 :
 * a1
 * 출력 예시 :
 * 2
 * <p>
 * 요구사항대로 충실히 구현하면 되는 문제이다.
 * 나이트의 8가지 경로를 하나씩 확인하며 각 위치로 이동이 가능한지 확인한다.
 * 리스트를 이용하여 8가지 방향에 대한 방향 벡터를 정의한다.
 */
public class P3_RoyalNight {
    public static void main(String[] args) {
        /**
         * 내 풀이
         */
        Scanner scanner = new Scanner(System.in);
        String position = scanner.next();
        int x = 0;
        String strX = position.split("")[0];
        String[] positionX = {"", "a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 1; i < positionX.length; i++) {
            if (positionX[i].equals(strX)) {
                x = i;
            }
        }
        int y = Integer.parseInt(position.split("")[1]);
        int count = 0;
        System.out.println(x);
        System.out.println(y);
        int[] verticalX = {2, 2, -2, -2};
        int[] verticalY = {1, -1, 1, -1};
        int[] horizontalX = {1, -1, 1, -1};
        int[] horizontalY = {2, 2, -2, -2};
        for (int i = 0; i < verticalX.length; i++) {
            int dx = x + verticalX[i];
            int dy = y + verticalY[i];
            if (dx >= 1 && dy >= 1 && dx <= 8 && dy <= 8) {
                count++;
            }
        }
        for (int i = 0; i < horizontalX.length; i++) {
            int dx = x + horizontalX[i];
            int dy = y + horizontalY[i];
            if (dx >= 1 && dy >= 1 && dx <= 8 && dy <= 8) {
                count++;
            }
        }
        System.out.println(count);
        /**
         * 유튜브 풀이
         */
        scanner.nextLine();
        String inputData = scanner.nextLine();
//        char -> int 형변환
//        chr - '0';
        int row = inputData.charAt(1) - '0';
//        char alphabet -> int 변환
//        char - 'a' : 'a'는 97이다. +1 을하면 a=1, b=2 . . .
        int column = inputData.charAt(0) - 'a' + 1;
//        나이트가 이동할 수 있는 8가지 방향 정의
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
//        8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
        int result = 0;
        for (int i = 0; i < 8; i++) {
//            이동하고자 하는 위치 확인
            int nextRow = row + dx[i];
            int nextColumn = column + dy[i];
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}
