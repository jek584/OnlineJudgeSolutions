import java.util.Scanner;

public class TJU_2803 {
    public static String s = "No solution!";

    public boolean isSame (double x, double y) {
        return (x == y);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double ac = (Math.sqrt(b * b - 4 * a * c) - b) / (2 * a);
            double ab = (-1 * Math.sqrt(b * b - 4 * a * c) - b) / (2 * a);
            if (Double.isNaN(ac)) {
                System.out.println(s);
            } else if (ab == ac) {
                System.out.printf("%.3f\n", ab);
            } else {
                System.out.printf("%.3f %.3f\n", ab, ac);
            }
        }
    }
}
