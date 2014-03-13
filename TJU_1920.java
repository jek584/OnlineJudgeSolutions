import java.util.Scanner;

public class TJU_1920 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            double lol = sc.nextDouble();
            if (lol == 0) {
                break;
            } else {
                System.out.println(gen(lol) + " card(s)");
            }
        }

    }

    public static int gen (double k) {
        double sum = 0;
        for (int i = 1; i < 521; i++) {
            if (sum >= k) {
                return i - 1;
            }
            sum += ((double) 1 / (double) (i + 1));
        }
        return -1;
    }
}
