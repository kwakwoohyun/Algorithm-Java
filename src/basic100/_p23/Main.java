package basic100._p23;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
    입력된 문자열을 뒤집어서 출력
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = Arrays.asList(scanner.nextLine().split(""));
        Collections.reverse(stringList);
        stringList.stream().forEach(System.out::print);
    }

}
