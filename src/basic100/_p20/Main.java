package basic100._p20;

/*
    100까지 369 게임을 진행
 */
public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            String strNum = String.valueOf(i);
            char[] num = strNum.toCharArray();
            boolean isThree = false;
            for (int j = 0; j < num.length; j++) {
                if (num[j] == '3' || num[j] == '6' || num[j] == '9') {
                    System.out.print("짝");
                    isThree = true;
                }
            }
            if (!isThree) {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }

}
