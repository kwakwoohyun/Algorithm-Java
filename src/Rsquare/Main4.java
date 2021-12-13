package Rsquare;

import java.util.Scanner;

public class Main4 {

    public static String getFormattedName(String firstName, String lastName) {
        String formattedName;
        formattedName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1, firstName.length()).toLowerCase() + " " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1, lastName.length()).toLowerCase();

        return formattedName;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //테스트케이스의 수를 입력받는다
        int caseNum = scanner.nextInt();

        //테스트케이스 수 만큼 반복하며 데이터를 입력받고 정답을 출력한다
        for (int caseIndex = 1; caseIndex <= caseNum; caseIndex++) {
            //성과 이름을 차례로 입력받는다
            String firstName = scanner.next();
            String lastName = scanner.next();

            //주어진 함수를 이용해 포메팅된 이름 문자열을 얻는다
            String answer = getFormattedName(firstName, lastName);

            //정답을 형식에 맞게 출력한다
            System.out.printf("Case #%d\n", caseIndex);
            System.out.println(answer);
        }
    }

}
