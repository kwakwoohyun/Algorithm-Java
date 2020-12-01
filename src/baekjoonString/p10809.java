package baekjoonString;

import java.util.Arrays;
import java.util.Scanner;

public class p10809 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int basic[] = new int[26];
        char[] S = sc.next().toCharArray();
        Arrays.fill(basic, -1);
//        baekjoon
        for (int i = 0; i < S.length; i++) {
            if (basic[S[i] - 97] == -1) {
                basic[(int) S[i] - 97] = i;
            }
        }
        for (int i = 0; i < basic.length; i++) {
            System.out.println(basic[i]);
        }
    }

}
