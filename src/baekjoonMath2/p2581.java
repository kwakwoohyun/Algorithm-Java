package baekjoonMath2;

import java.util.Scanner;

public class p2581 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int M = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;
        int min = 100000;
        int sosu = 0;
        for (int i = M; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sosu = sosu + 1;
                }
            }
            if (sosu == 2){
                sum = sum + i;
                if (i<min){
                    min = i;
                }
            }
            sosu = 0;
        }
        if (min == 100000){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
