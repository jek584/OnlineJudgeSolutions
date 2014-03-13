import java.math.BigInteger;
import java.util.Scanner;
// print out the LCM and GCF of 2 numbers, I discovered that bigInt had a built
// in
// GCD function so I wanted to use it.

public class LCMGCF {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            BigInteger A = new BigInteger(a + "");
            BigInteger B = new BigInteger(b + "");
            System.out.println((i + 1) + " " + lcm(a, b) + " " + A.gcd(B));
        }
    }

    public static int lcm (int a, int b) {
        for (int i = 1; true; i++) {
            if (i * a % b == 0)
                return i * a;
        }
    }
}
