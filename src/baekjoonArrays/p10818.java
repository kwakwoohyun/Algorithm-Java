package baekjoonArrays;

import java.util.Scanner;

public class p10818 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int repeatCount = sc.nextInt();
        int numArrays[] = new int[repeatCount];
        int min = 1000000;
        int max = 0;
        for (int i = 0; i < repeatCount; i++) {
            numArrays[i] = sc.nextInt();
            if (numArrays[i] < min) {
                min = numArrays[i];
            }
            if (numArrays[i] > max) {
                max = numArrays[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
