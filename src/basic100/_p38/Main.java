package basic100._p38;

import java.util.*;

/*
    강민이는 치킨 한 마리를 주문할 수 있는 치킨 쿠폰을 n장 가지고 있다.
    이 치킨집에서는 치킨을 한마리 주문할 때마다 도장을 하나씩 찍어주는데,
    도장을 k개 모으면 치킨 쿠폰 한장으로 교환할 수 있다.
    강민이가 지금 갖고 있는 치킨 쿠폰으로 치킨을 최대 몇마리나 먹을 수 있는지 구하여라.
    입력 : n k
    출력 : 정답
    예제 : 입력 -> 4 3 출력 -> 5
          입력 -> 10 3 출력 -> 14
          입력 -> 100 5 출력 -> 124
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int coupon = 0;
        int chicken = 0;
        while (n != 0) {
            coupon++;
            chicken++;
            n--;
            if (coupon == k) {
                n++;
                coupon = 0;
            }
        }
        System.out.println(chicken);
    }
}
