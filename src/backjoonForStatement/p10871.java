package backjoonForStatement;

import java.util.Scanner;

public class p10871 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int repeatCount = sc.nextInt();
        int standard = sc.nextInt();
        int num[] = new int[repeatCount];
        for (int i = 0; i < repeatCount; i++) {
            num[i] = sc.nextInt();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] < standard) {
                System.out.print(num[i] + " ");
            }
        }
    }

}
