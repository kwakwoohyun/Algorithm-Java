package baekjoonMath2;

import java.util.Scanner;

public class p1978 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = sc.nextInt();
        int[] intArrays = new int[N];
        for (int i = 0; i < N; i++) {
            intArrays[i] = sc.nextInt();
        }
        int sosuCount = 0;
        int sosu = 0;
        for (int i = 0; i < intArrays.length; i++) {
            if (intArrays[i] == 1) {
                continue;
            }
            for (int j = 1; j <= intArrays[i]; j++) {
                if (intArrays[i] % j == 0) {
                    sosu = sosu + 1;
                }
            }
            if (sosu == 2) {
                sosuCount = sosuCount + 1;
            }
            sosu = 0;
        }
        System.out.println(sosuCount);
    }
}
