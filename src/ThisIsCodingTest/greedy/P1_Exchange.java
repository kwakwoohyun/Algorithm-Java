package ThisIsCodingTest.greedy;

/**
 * 그리디 알고리즘
 * 거스름돈 문제
 */
public class P1_Exchange {

    public static void main(String[] args) {
        int n = 1260;
        int count = 0;
        int[] array = {500, 100, 50, 10};
        for (int i = 0; i < array.length; i++) {
            count = count + (n / array[i]);
            n = n % array[i];
        }
        System.out.println(count);
    }

}
