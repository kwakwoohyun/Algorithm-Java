package basic100._p24;

import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

/*
    학생 수와 점수들이 순서대로 입력된다.
    평균보다 넘은 학생들의 비율을 출력
    입력 : 7 100 95 90 80 70 60 50
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] score = new int[count];
        double average = 0;
        long resultCount = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
        }
        average = Arrays.stream(score).average().getAsDouble();
        System.out.println("average : " + average);
        resultCount = Arrays.stream(score).filter(n -> n > Arrays.stream(score).average().getAsDouble()).count();
        System.out.println(resultCount);
//        for (int i = 0; i < score.length; i++) {
//            if (score[i] > average) {
//                resultCount++;
//            }
//        }
        System.out.println(Math.round((double) resultCount / (double) count * 100 * 1000) / 1000.0 + "%");

//        퍼센트 구하기
//        int a = 5;
//        int b = 10;
//        double c = (double) a / (double) b * 100;
//        System.out.println(c);
    }

}
