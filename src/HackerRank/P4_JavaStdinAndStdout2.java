package HackerRank;
import java.util.*;

/*
In this challenge, you must read an integer, a double, and a String from stdin,
then print the values according to the instructions in the Output Format section below.
To make the problem a little easier, a portion of the code is provided for you in the editor.

Input Format
There are three lines of input:
    The first line contains an integer.
    The second line contains a double.
    The third line contains a String.

Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
To make the problem easier, a portion of the code is already provided in the editor.

Sample Input
42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42

설명된 블로그 https://deftkang.tistory.com/55
 */
public class P4_JavaStdinAndStdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
