package basic100._p14;

import java.util.Arrays;
import java.util.Scanner;

/*
    입력된 숫자의 갯수를 출력
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("");
        int[] number = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[10];
        for (int i = 0; i < number.length; i++) {
            result[number[i]]++;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(i + " : " + result[i]);
        }
    }

}
