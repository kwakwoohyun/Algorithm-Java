package Rsquare;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main6 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int allLength = Integer.parseInt(input);
        int count = 0;
        for (int i = 1; i <= allLength / 3; i++) {
            for (int j = (allLength - i) / 2; j >= i; j--) {
                int c = allLength - i - j;
                if (c < i + j) {
                    count++;
                } else {
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
