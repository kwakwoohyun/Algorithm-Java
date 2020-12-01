package baeckjoonString;

import java.util.Scanner;

public class p11720 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        char[] target = sc.next().toCharArray();
        int sum = 0;
        for (int i = 0; i < target.length; i++) {
            sum = sum + Integer.parseInt(String.valueOf(target[i]));
        }
        System.out.println(sum);
    }

}
