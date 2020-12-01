package backjoonMethod;

import java.util.Scanner;

public class p1065 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int repeagCount = sc.nextInt();
        int hansuCount = 0;
        for (int i = 1; i <= repeagCount; i++) {
            if (checkHansu(i)) {
                hansuCount = hansuCount + 1;
            }
        }
        System.out.println(hansuCount);
    }

    public static boolean checkHansu(int num) {
        char[] target = String.valueOf(num).toCharArray();
        if (target.length <= 2) {
            return true;
        } else {
            int cha[] = new int[target.length - 1];
            for (int i = 0; i < target.length - 1; i++) {
                cha[i] = target[i] - target[i + 1];
            }
            for (int i = 0; i < cha.length - 1; i++) {
                if (cha[i] == cha[i + 1]) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
