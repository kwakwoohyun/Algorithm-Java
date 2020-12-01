package baeckjoonForStatement;

import java.util.Scanner;

public class p10950 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int result[] = new int[T];
        for (int i = 0; i < T; i++) {
            result[i] = sc.nextInt() + sc.nextInt();
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
