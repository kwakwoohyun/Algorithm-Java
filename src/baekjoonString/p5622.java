package baekjoonString;

import java.util.Scanner;

public class p5622 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String alpha[] = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
        char[] input = sc.next().toCharArray();
        int time = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < alpha.length; j++) {
                char[] ch = alpha[j].toCharArray();
                for (int k = 0; k < ch.length; k++) {
                    if (input[i] == ch[k]) {
                        time = time + (j + 1);
                    }
                }
            }
        }
        System.out.println(time);
    }

}
