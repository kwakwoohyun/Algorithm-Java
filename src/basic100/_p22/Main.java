package basic100._p22;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
    입력된 수가 '팰린드롬'인지 판별
    팰린드롬 : 회문 또는 팰린드롬은 거꾸로 읽어도 제대로 읽는 것과 같은 문장이나 낱말, 숫자, 문자열 등이다.
            보통 낱말 사이에 있는 띄어쓰기나 문장 부호는 무시한다.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arr[] = scanner.nextLine().split("");
        boolean result = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (!arr[i].equals(arr[arr.length - 1 - i])) {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }

}
