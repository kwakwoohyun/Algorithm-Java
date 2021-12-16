package basic100._p9;

import java.util.Arrays;
import java.util.Scanner;

/*
    입력된 수의 각 자릿수의 합을 구하세요
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("수를 입력하세요. :");
        String[] str = scanner.next().split("");
        int result = 0;
        for (int i = 0; i < str.length; i++) {
            result = result + Integer.parseInt(str[i]);
        }
        System.out.println(result);

//        다른방법
        System.out.println("수를 입력하세요. :");
        int num = scanner.nextInt();
        int result2 = 0;
        while (num!=0){
            result2 = result2 + (num % 10);
            num = num / 10;
        }
        System.out.println(result2);
    }
}
