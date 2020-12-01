package baekjoonForStatement;

import java.io.*;

public class p11021 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            String a[] = br.readLine().split(" ");
            bw.write("Case #" + (i + 1) + ": " + (Integer.parseInt(a[0]) + Integer.parseInt(a[1])) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
