package baekjoonForStatement;

import java.io.*;

public class p15552 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        /*
         * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와
         * BufferedWriter를 사용할 수 있다. BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다. Java를 처음
         * 접하시는 분들이 주로 받는 입력방식은 Scanner입니다. Scanner를 통해 입력을 받을경우 Space Enter를 모두 경계로
         * 인식하기에 입력받은 데이터를 가공하기 매우 편리합니다. 하지만 그에비해 BufferedReader는 Enter만 경계로 인식하고 받은
         * 데이터가 String으로 고정되기때문에 입력받은 데이터를 가공하는 작업이 필요할경우가 많습니다. Scanner에 비해 다소 사용하기
         * 불편하죠. 하지만 많은 양의 데이터를 입력받을경우 BufferedReader를 통해 입력받는 것이 효율면에서 훨씬 낫습니다. 입력시
         * Buffer를 활용함으로써 작업속도 차이가 많이납니다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int s = Integer.parseInt(br.readLine());
        for (int i = 0; i < s; i++) {
            String a = br.readLine();
            String[] b = String.valueOf(a).split(" ");
            bw.write(Integer.parseInt(b[0]) + Integer.parseInt(b[1]) + "\n");
        }
        bw.flush();// 남아있는 데이터를 모두 출력시킴
        bw.close();// 스트림을 닫음
    }
}
