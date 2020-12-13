package baekjoonString;

import java.util.Scanner;

public class p1316 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int repeatCount = sc.nextInt();
        int groupStringCount = 0;
        boolean flag = true;
        for (int i = 0; i < repeatCount; i++) {
            if (flag) {
                if (repeatCount != 1) {
                    groupStringCount = groupStringCount + 1;
                }
            } else {
                flag = true;
            }
            char[] charStr = sc.next().toCharArray();
            for (int j = 0; j < charStr.length - 1; j++) {
                if (flag) {
                    for (int k = j + 1; k < charStr.length; k++) {
                        if (flag) {
                            if (charStr[j] == charStr[k]) {
                                if (charStr[k] != charStr[k - 1]) {
                                    flag = false;
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        }
        System.out.println(groupStringCount);
    }

}
