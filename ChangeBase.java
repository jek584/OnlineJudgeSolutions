import java.math.BigInteger;
import java.util.Scanner;
// converts a big integer to a different base and outputs it %10007
// I think this one was UVA?

public class ChangeBase {
    public static int baseChange (String s, int b) {
        BigInteger sum = new BigInteger("0");
        BigInteger base = new BigInteger(Integer.toString(b));
        for (int i = s.length() - 1, index = 0; i > -1; i--, index++) {
            BigInteger num = new BigInteger(Character.toString(s.charAt(index)));
            BigInteger multiplicand = base.pow(i);
            num = num.multiply(multiplicand);
            sum = sum.add(num);
        }
        return sum.mod(new BigInteger("10007")).intValue();
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int base = sc.nextInt();
            String num = sc.next();
            System.out.println(baseChange(num, base));
        }
    }
}
