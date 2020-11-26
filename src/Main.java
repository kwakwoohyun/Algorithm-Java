import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

    }

    public long sum(int[] a){
        int sum = 0;
        for (int i=0; i<a.length;i++){
            sum = sum + a[i];
        }
        return sum;
    }
}
