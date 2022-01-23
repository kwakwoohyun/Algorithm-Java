package ThisIsCodingTest.greedy;

import java.util.*;

/**
 * 모험가 길드
 * <p>
 * 한 마을에 모험가가 N명 있다. 모험가 길드에서는 N명의 모험가를 대상으로 '공포도'를 측정했는데,
 * '공포도'가 높은 모험가는 쉽게 공포를 느껴 위험 상황에서 제대로 대처할 능력이 떨어진다.
 * 모험가 길드장인 동빈이는 모험가 그룹을 안전하게 구성하고자 공포도가 'X'인 모험가는 반드시 X명
 * 이상으로 구성한 모험가 그룹에 참여해야 여행을 떠날 수 있도록 규정했다.
 * 동빈이는 최대 몇 개의 모험가 그룹을 만들 수 있는지 궁금하다.
 * N명의 모험가에 대한 정보가 주어졌을때, 여행을 떠날 수 있는 그룹 수의 최댓값을 구해라.
 * <p>
 * 예를 들어 N = 5이고, 각 모험가의 공포도가 다음과 같다고 가정한다.
 * 2 3 1 2 2
 * 이 경우 그룹 1에 공포도가 1, 2, 3인 모험가를 한 명씩 넣고, 그룹 2에 공포도가 2인 남은 두
 * 명을 넣게 되면 총 2개의 그룹을 만들 수 있다.
 * 또한 몇 명의 모험가는 마을에 그대로 남아 있어도 되기 때문에, 모든 모험가를 특정한 그룹에
 * 넣을 필요는 없다.
 * <p>
 * 입력 조건 : 첫째 줄에 모험가의 수 N이 주어진다. (1 <= N <= 100,000)
 * 둘째 줄에 각 모험가의 공포도의 값을 N 이하의 자연수로 주어지며 각 자연수는 공백으로 구분
 * 출력 조건 : 여행을 떠날 수 있는 그룹 수의 최댓값을 출력
 */
public class P4_AdventurerGuild {
    public static void main(String[] args) {
        /**
         * 내풀이
         */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList<Integer> input = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            input.add(scanner.nextInt());
        }
        Collections.sort(input);
        int group = 0;
        int people = 0;
        for (int i = 0; i < input.size(); i++) {
            people = people + 1;
            if (input.get(i) <= people) {
                group++;
                people = 0;
            }
        }
        System.out.println(group);
        /**
         * 유튜브 풀이
         */
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
        Collections.sort(arrayList);
        int result = 0; // 총 그룹 수
        int count = 0; // 현재 그룹에 포함된 모험가의 수
        for (int i = 0; i < n; i++) { // 공포도를 낮은 것부터 하나씩 확인
            count += 1; // 현재 그룹에 해당 모험가를 포함시키기
            if (count >= arrayList.get(i)) { // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
                result += 1; // 총 그룹의 수 증가
                count = 0; // 현재 그룹에 포함된 모험가의 수 초기화
            }
        }
        System.out.println(result);
    }
}
