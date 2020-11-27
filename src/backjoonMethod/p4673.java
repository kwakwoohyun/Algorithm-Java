package backjoonMethod;

import java.util.HashSet;

public class p4673 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        loop();
    }

    public static void loop() {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 1; i <= 10000; i++) {
            set.add(constructor(i));
        }
        for (int i=1;i<=10000;i++){
            if (!set.contains(i)){
                System.out.println(i);
            }
        }
    }

    public static int constructor(int num) {
        int sum = 0;
        char targetNum[] = String.valueOf(num).toCharArray();
        for (int i = 0; i < targetNum.length; i++) {
            sum = sum + Integer.parseInt(String.valueOf(targetNum[i]));
        }
        sum = sum + num;
        return sum;
    }

}
