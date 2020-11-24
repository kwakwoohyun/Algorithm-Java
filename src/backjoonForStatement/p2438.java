package backjoonForStatement;

import java.util.Scanner;

public class p2438 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int repeatCount = sc.nextInt();
        for (int i = 0; i < repeatCount; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
