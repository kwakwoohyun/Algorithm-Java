package baekjoonString;

import java.util.Arrays;
import java.util.Scanner;

public class p1157 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        Integer[] alphaCount = new Integer[26];
        Arrays.fill(alphaCount, 0);
        int max = -99;
        int index=-1;
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.toUpperCase(str[i]);
            alphaCount[str[i] - 65] = alphaCount[str[i] - 65] + 1;
            if (alphaCount[str[i] - 65] > max) {
                max = alphaCount[str[i] - 65];
                index=str[i] - 65;
            }
        }
        if (str.length == 1){
            System.out.println(str[0]);
            return;
        }
        for (int i = 0; i < alphaCount.length; i++) {
            if(alphaCount[i]==max&& i != index){
                System.out.println("?");
                return;
            }
        }
        System.out.println((char)('A'+index));
    }

}
