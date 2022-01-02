package basic100._p29;

import java.util.*;

/*
    1부터 8까지 차례대로 입력되면 ascending,
    8부터 1까지 차례대로 입력되면 descending,
    둘다 아니라면 mixed를 출력
    1 2 3 4 5 6 7 8
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[8];
        for (int i = 0; i < 8; i++) {
            input[i] = scanner.nextInt();
        }
        boolean flag = true;
        System.out.println(Arrays.toString(input));
        switch (input[0]) {
            case 1:
                for (int i = 0; i < input.length - 1; i++) {
                    if (input[i + 1] - input[i] != 1) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("ascending");
                }else{
                    System.out.println("mixed");
                }
                break;
            case 8:
                for (int i = 0; i < input.length - 1; i++) {
                    if (input[i] - input[i + 1] != 1) {
                        flag = false;
                    }
                }
                if (flag) {
                    System.out.println("descending");
                }else{
                    System.out.println("mixed");
                }
                break;
            default:
                System.out.println("mixed");
                break;
        }
    }

}
