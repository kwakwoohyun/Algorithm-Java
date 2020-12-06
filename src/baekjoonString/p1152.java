package baekjoonString;

import java.util.Scanner;

public class p1152 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        String word[] = str.split(" ");
        int count = 0;
        for (String s : word){
            if (!s.equalsIgnoreCase("")){
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
