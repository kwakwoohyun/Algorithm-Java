package Rsquare;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] coinType = {500, 100, 50, 10};
        int remainMoney = 1000 - Integer.parseInt(input);
        int[] resultArray = new int[4];
        int count = 0;
        while (remainMoney != 0) {
            resultArray[count] = remainMoney / coinType[count];
            remainMoney = remainMoney % coinType[count];
            count += 1;
        }
        for (int i = 0; i < coinType.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
    }

}
