import java.util.HashMap;
import java.util.Scanner;

public class TJU_2775 {
    public static HashMap<Integer, Integer> map;

    public static int fib (int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            map.put(n, fib(n - 1) + fib(n - 2));
        }
        return map.get(n);

    }

    public static void main (String[] args) {
        map = new HashMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int n = sc.nextInt();
            System.out.println(fib(n) + " " + fib(n + 1));
        }

    }
}
