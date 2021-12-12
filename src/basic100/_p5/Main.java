package basic100._p5;

import java.util.Arrays;
import java.util.Scanner;

/*
    대문자는 소문자로, 소문자는 대문자로 변환
    helloWorlD -> HELLOwORLd
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            } else if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        System.out.println(charArray);
    }
}
