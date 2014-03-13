import java.util.Scanner;

public class TJU_3232 {
    public static int moves;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a > (c - b)) {
            moves = b - a;
        } else if (c > (b - a)) {
            moves = c - b;
        }
        System.out.print(moves - 1);
    }

    public static void kangas (int a, int b, int c) {
        if (b == c - 1 || a == c - 1) {
            return;
        }
        moves++;
        if (b > a) {
            a = b + 1;
            kangas(a, b, c);
            return;
        } else {
            b = a + 1;
            kangas(a, b, c);
        }
    }

}
