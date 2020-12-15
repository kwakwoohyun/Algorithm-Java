package baekjoonMath1;

import java.util.Scanner;

public class p2869 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Integer A = sc.nextInt();
        Integer B = sc.nextInt();
        Integer V = sc.nextInt();
        System.out.println((V - A) % (A - B) == 0 ? (V - A) / (A - B) + 1 : (V - A) / (A - B) + 2);
    }
}
