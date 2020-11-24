import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int repeatCount = sc.nextInt();
        int numArrays[] = new int[repeatCount];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < repeatCount; i++) {
            numArrays[i] = sc.nextInt();
        }
        for (int i = 0; i < repeatCount; i++) {
            if (numArrays[i] < min) {
                min = numArrays[i];
            }
            if (numArrays[i] > max) {
                max = numArrays[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
