package basic100._p21;

import java.util.Arrays;
import java.util.Scanner;

/*
    1 ~ 100까지 숫자가 입력될때 한번이라도 입되었으면 출력하시오
    입력: 1 2 3 1 1 2 3 4 5 5
    출력 : 1 2 3 4 5
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        str 배열을 -> int 배열로
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[arr[i]]++;
        }
        for (int i = 0; i < resultArr.length; i++) {
            if (resultArr[i] != 0) {
                System.out.printf("%-2d", i);
            }
        }
    }

}
