package Rsquare;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    //표준입력을 수행할 Scanner를 선언한다
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {   //프로그램의 시작부
        int[] job = new int[5];
        int answer; //이 변수에 답을 저장한다
        for (int i = 0; i < 5; i++) {
            job[i] = scanner.nextInt();
        }

        int[] firstJob = Arrays.copyOf(job, 4);
        int lastJob = job[4];

        Arrays.sort(firstJob);
        Arrays.sort(job);

        if (firstJob[0] + lastJob > job[4]) {
            answer = firstJob[0] + lastJob;
        } else {
            answer = job[4];
        }

        //정답을 출력한다
        System.out.printf("%d\n", answer);
    }

}
