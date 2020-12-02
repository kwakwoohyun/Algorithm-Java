package baekjoonString;

import java.util.Scanner;

public class p2675 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int totalCount = sc.nextInt();
        for (int i = 0; i < totalCount; i++) {
            int repeatCount = sc.nextInt();
            char ch[] = sc.next().toCharArray();
            for (int j = 0; j < ch.length; j++) {
                for (int k = 0; k < repeatCount; k++) {
                    System.out.print(ch[j]);
                }
            }
            System.out.println();
        }

    }
}
