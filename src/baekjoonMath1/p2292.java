package baekjoonMath1;

import java.util.Scanner;

public class p2292 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = sc.nextInt();
        int sum = 1;
        int i = 1;
        while (true) {
            if (N != 1) {
                sum = sum + (6 * i);
                if (N <= sum) {
                    System.out.println(i + 1);
                    break;
                }
                i++;
            } else {
                System.out.println(1);
                break;
            }
        }
    }
}
