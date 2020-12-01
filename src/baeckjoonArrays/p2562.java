package baeckjoonArrays;

import java.util.Scanner;

public class p2562 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int numArrays[] = new int[9];
        int maxNum = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < 9; i++) {
            numArrays[i] = sc.nextInt();
            if (numArrays[i] > maxNum) {
                maxNum = numArrays[i];
                maxIndex = i + 1;
            }
        }
        System.out.println(maxNum);
        System.out.println(maxIndex);
    }

}
