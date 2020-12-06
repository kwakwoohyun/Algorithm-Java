package baekjoonString;

import java.util.Scanner;

public class p2908 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        StringBuffer sbA = new StringBuffer(sc.next());
        StringBuffer sbB = new StringBuffer(sc.next());
        sbA.reverse();
        sbB.reverse();
        System.out.println(Integer.parseInt(String.valueOf(sbA)) > Integer.parseInt(String.valueOf(sbB)) ? sbA : sbB);
    }

}
