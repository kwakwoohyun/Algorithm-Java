package backjoonArrays;

import java.util.Scanner;

public class p8958 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int repeatCount = sc.nextInt();
        String example[] = new String[repeatCount];
        for (int i = 0; i < repeatCount; i++) {
            example[i] = sc.next();
        }

        for (int i = 0; i < repeatCount; i++) {
            int num[] = new int[example[i].length()];
            int sum = 0;
            char a[] = example[i].toCharArray();
            int result = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == 'O') {
                    num[j] = sum + 1;
                    sum++;
                } else {
                    sum = 0;
                }
                if (num[j] != 0) {
                    result = result + num[j];
                }
            }
            System.out.println(result);
        }
    }
}
