package baeckjoonArrays;

import java.util.Scanner;

public class p2577 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        char result[] = String.valueOf(a * b * c).toCharArray();
        int returnArray[] = new int[10];
        int j = 0;
        for (int i = 0; i < result.length; i++) {
            j = Integer.parseInt(String.valueOf(result[i]));
            returnArray[j]++;
        }
        for (int i = 0; i < returnArray.length; i++) {
            System.out.println(returnArray[i]);
        }
    }

}
