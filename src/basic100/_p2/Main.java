package basic100._p2;

import java.util.Arrays;
import java.util.Scanner;

/*
    피보나치 수열을 출력해라
    An = An-1 + An-2
    1 1 2 3 5 8 13 21 34
 */
public class Main {

    public static void main(String[] args) {

//        배열 사용
        System.out.println("피보나치 수열 몇 번째 항까지 구하시겠습니까?");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));


//        두번째 방법
        int first = 1;
        int second = 1;
        System.out.print(" " + first + " ");
        System.out.print(" " + second + " ");
        for (int i = 3; i < count; i++) {
            int num = first + second;
            first = second;
            second = num;
            System.out.print(" " + num + " ");
        }
    }

}
