package baekjoonMath1;

public class p2839 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int N = sc.nextInt();
        int count3Kg = 0;
        if (N % 5 == 0) {
            System.out.println(N / 5);
        } else {
            int tempN = N;
            for (int i = N / 5; i >= 0; i--) {
                if (i == 0) {
                    if (tempN % 3 == 0) {
                        count3Kg = tempN / 3;
                        System.out.println(i + count3Kg);
                        break;
                    } else {
                        System.out.println(-1);
                        break;
                    }
                }
                tempN = tempN - (i * 5);
                count3Kg = tempN / 3;
                tempN = tempN % 3;
                if (tempN == 0) {
                    System.out.println(i + count3Kg);
                    break;
                } else {
                    tempN = N;
                    count3Kg = 0;
                }
            }
        }

    }
    
}
