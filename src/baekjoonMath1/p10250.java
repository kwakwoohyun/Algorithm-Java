package baekjoonMath1;

import java.util.Scanner;

public class p10250 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int H, W, N, Y;
        int X;

        for (int i = 0; i < T; i++) {
            H = sc.nextInt();
            W = sc.nextInt();
            N = sc.nextInt();

            X = N % H;
            Y = (N / H) + 1;

            if (X == 0) {
                Y = N / H;
                X = H;
            }
            System.out.println(X * 100 + Y);
        }
    }
}
