package baekjoonString;

import java.util.Scanner;

public class p2941 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        Scanner sc = new Scanner(System.in);
        String alpha = sc.next();
        for (String str : croatia) {
            alpha = alpha.replaceAll(str, "*");
        }
        System.out.println(alpha.length());
    }
    
}
