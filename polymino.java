import java.util.Scanner;

public class polymino {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (isPrime(n)) {
                StringBuilder s = new StringBuilder("" + n);
                s.reverse();
                int x = Integer.parseInt(s.toString());
                if (isPrime(x)) {
                    System.out.println(n + " is emirp.");
                } else {
                    System.out.println(n + " is prime.");
                }
            } else {
                System.out.println(n + " is not prime.");
            }

        }
    }

    public static boolean isPrime (int n) {
        // simple check for all even numbers, cuts program time by half
        if (n % 2 == 0) {
            return false;
        }
        int ceiling = (int) Math.ceil(Math.sqrt(n));
        for (int i = 3; i < ceiling; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
