import java.util.Scanner;

public class TJU_3013 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (true) {
            int radius = sc.nextInt();
            if (radius == 0) {
                break;
            }
            int x = sc.nextInt();
            int y = sc.nextInt();
            double sRad = Math.sqrt(x * x + y * y) / 2;
            String s = "";
            if (radius >= sRad) {
                s = " fits on the table.";
            } else {
                s = " does not fit on the table.";
            }
            System.out.println("Pizza " + i + s);
            i++;
        }

    }
}
