package basic100._p26;

import java.util.*;

/*
    상수는 수를 다른사람과 다르게 거꾸로 읽는다.
    예를들어 734, 893을 칠판에 적었다면,
    상수는 437, 398로 읽는다.
    따라서 상수는 두 수중 큰수 437이라고 말할 것이다.

    입력 : 734 893
    출력 : 437
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] num1 = scanner.next().split("");
        String[] num2 = scanner.next().split("");
        List<String> numList1 = new ArrayList<>(Arrays.asList(num1));
        List<String> numList2 = new ArrayList<>(Arrays.asList(num2));
        Collections.reverse(numList1);
        Collections.reverse(numList2);
        String reverseNum1 = "";
        String reverseNum2 = "";
        for (String num : numList1) {
            reverseNum1 = reverseNum1 + num;
        }
        for (String num : numList2) {
            reverseNum2 = reverseNum2 + num;
        }
        System.out.println(Integer.parseInt(reverseNum1) > Integer.parseInt(reverseNum2) ? reverseNum1 : reverseNum2);
    }

}
