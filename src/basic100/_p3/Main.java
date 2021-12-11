package basic100._p3;

import java.util.Arrays;

/*
    가장 많이 출현한 수를 출력하시오
    1 2 2 3 1 4 2 2 4 3 5 3 2
    정답 : 2 (5회)
 */
public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 1, 4, 2, 2, 4, 3, 5, 3, 2};
        int resultArr[] = new int[10];
        int maxNum = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            resultArr[arr[i]]++;
        }
        for (int i = 0; i < resultArr.length; i++) {
            if (resultArr[i] > maxCount) {
                maxCount = resultArr[i];
                maxNum = i;
            }
        }
        System.out.println(maxNum + " (" + maxCount + "회)");
    }

}
