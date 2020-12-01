package baekjoonForStatement;

import java.io.*;

public class p2741 {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for (int i = 1; i <= num; i++) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
