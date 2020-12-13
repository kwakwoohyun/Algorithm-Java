package baekjoonMath1;

import java.util.Scanner;

public class p1712 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long C = sc.nextLong();
        int count = 0;
//        손익분기점이 존재하지 않을경우 : 판매 가격이 생산비용보다 작거나 같을때 : C <= B
        if (C <= B) {
            System.out.println(-1);
            return;
        }
        while (true) {
            if (A + B * count < C * count) {
                System.out.println(count);
                break;
            } else {
                count = count + 1;
            }
        }
        /*
        A + B*x < C*x
        = A < C*x- B*x
        = A < (C-B)*x
        = A/(C-B) < x
        A/(C-B)는 x보다 작다. 이익을 내야하기 때문에 +1을 해주면 된다.
         */

    }

}
