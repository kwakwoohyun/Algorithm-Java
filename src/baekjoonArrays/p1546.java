package baekjoonArrays;

import java.util.Scanner;

public class p1546 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        double grade[] = new double[count];
        double newGrade[] = new double[count];
        double m = 0;
        double sum = 0;
        for (int i = 0; i < count; i++) {
            grade[i] = sc.nextInt();
            if (grade[i] > m) {
                m = grade[i];
            }
        }
        for (int i = 0; i < count; i++) {
            newGrade[i] = grade[i] / m * 100;
            sum = sum + newGrade[i];
        }
        System.out.println(sum / count);
    }
}
