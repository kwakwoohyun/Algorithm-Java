package basic100._p20;

/*
    100까지 369 게임을 진행
    1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝 20 21 22 짝
    24 25 짝 27 28 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 40 41 42 짝 44
    45 짝 47 48 짝 50 51 52 짝 54 55 짝 57 58 짝 짝 짝 짝 짝짝 짝 짝 짝짝
    짝 짝 짝짝 70 71 72 짝 74 75 짝 77 78 짝 80 81 82 짝 84 85 짝 87
    88 짝 짝 짝 짝 짝짝 짝 짝 짝짝 짝 짝 짝짝 100
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
