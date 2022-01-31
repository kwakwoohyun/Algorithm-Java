package ThisIsCodingTest.implementation;

import java.util.*;

/**
 * 문자열 재정렬
 * <p>
 * 알파벳 대문자와 숫자(0~9)로만 구성된 문자열이 입력으로 주어진다.
 * 이때 모든 알파벳을 오름차순으로 정렬하여 이어서 출력한 뒤에, 그 뒤에 모든 숫자를 더한 값을 이어서 출력한다.
 * 예를 들어 K1KA5CB7이라는 값이 들어오면 ABCKK13을 출력한다.
 * <p>
 * 입력 조건 :
 * 첫째 줄에 하나의 문자열 S가 주어딘다.(1<=S의 길이<=10,000)
 * <p>
 * 출력 조건 :
 * 첫째 줄에 문제에서 요구하는 정답을 출력한다.
 * <p>
 * 입력 예시 :
 * K1KA5CB7
 * 출력 예시 :
 * ABCKK13
 * <p>
 * 입력 예시 :
 * AJKDLSI412K4JSJ9D
 * 출력 예시 :
 * ADDIJJJKKLSS20
 * <p>
 * 요구사항대로 충실이 구현하면 되는 문제이다.
 * 문자열이 입력되었을 때 문자를 하나씩 확인한다.
 * 숫자인 경우 따로 합계를 계산한다.
 * 알파벳의 경우 별도의 리스트에 저장한다.
 * 결과적으로 리스트에 저장된 알파벳을 정렬해 출력하고, 합계를 뒤에 붙여 출력하면 정답이다.
 */
public class P4_StringReSort {
    public static void main(String[] args) {
        /**
         * 내풀이
         */
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        Arrays.sort(input);
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            try {
                sum = sum + Integer.parseInt(input[i]);
            } catch (Exception e) {
                System.out.print(input[i]);
                continue;
            }
        }
        if (sum != 0) {
            System.out.println(sum);
        }
        /**
         * 유튜브 풀이
         */
        String str;
        ArrayList<Character> result = new ArrayList<>();
        int value = 0;
        str = scanner.next();
//        문자를 하나씩 확인한다.
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                result.add(str.charAt(i));
            } else {
                value = value + str.charAt(i) - '0';
            }
        }
//        알파벳을 오름차순으로 정렬
        Collections.sort(result);
//        알파벳을 차례대로 출력
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
        }
//        숫자가 하나라도 존재하는 경우 가장 뒤에 출력
        if (value != 0) {
            System.out.println(value);
        }
    }
}
