package baekjoonMath1;

import java.util.Scanner;

public class p1193 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int input = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (true) {
            sum = sum + i;
            if (input <= sum) {
                if (i % 2 == 0) {
//                    짝수
                    System.out.println((i - (sum - input)) + "/" + ((i + 1) - (i - (sum - input))));
                } else {
//                    홀수
                    System.out.println(((i + 1) - (i - (sum - input))) + "/" + (i - (sum - input)));
                }
                break;
            }
            i = i + 1;
        }
    }
}
