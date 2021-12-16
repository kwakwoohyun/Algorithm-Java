package basic100._p8;


import java.util.Scanner;

/*
    입력된 수의 팩토리얼을 구하시오
    factorial
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요. :");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        if (num == 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

}
