package backjoonArrays;

import java.util.HashSet;
import java.util.Scanner;

public class p3052 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int num[] = new int[10];
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            set.add(num[i] % 42);
        }
        System.out.println(set.size());
    }
}
