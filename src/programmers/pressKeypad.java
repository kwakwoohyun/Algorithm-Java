package programmers;

public class pressKeypad {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand = "right";
        System.out.println(solution(numbers, hand));
    }

    public static String solution(int[] numbers, String hand) {
        String answer = "";
        StringBuilder answerBuilder = new StringBuilder();
        String[][] phone = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"*", "0", "#"},
        };
        int leftX = 3;
        int leftY = 0;
        int rightX = 3;
        int rightY = 2;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < phone.length; j++) {
                for (int k = 0; k < phone[j].length; k++) {
                    if (String.valueOf(numbers[i]).equalsIgnoreCase(phone[j][k])) {
                        System.out.println("number[=====" + numbers[i]);
                        if (k == 0) {
                            answerBuilder.append("L");
                            leftX = j;
                            leftY = k;
                        } else if (k == 2) {
                            answerBuilder.append("R");
                            rightX = j;
                            rightY = k;
                        } else {
                            int leftDistinct = Math.abs(j - leftX) + Math.abs(k - leftY);
                            int rightDistinct = Math.abs(j - rightX) + Math.abs(k - rightY);
                            if (leftDistinct > rightDistinct) {
                                answerBuilder.append("R");
                                rightX = j;
                                rightY = k;
                            } else if (leftDistinct < rightDistinct) {
                                answerBuilder.append("L");
                                leftX = j;
                                leftY = k;
                            } else {
                                answerBuilder.append(hand.equalsIgnoreCase("right") ? "R" : "L");
                                if (hand.equalsIgnoreCase("right")) {
                                    rightX = j;
                                    rightY = k;
                                } else {
                                    leftX = j;
                                    leftY = k;
                                }
                            }
                        }
                    }
                }
            }
        }
        answer = String.valueOf(answerBuilder);
        return answer;
    }
}
