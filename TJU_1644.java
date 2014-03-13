import java.util.Scanner;

public class TJU_1644 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i <= cases; i++) {
            StringBuilder sb = new StringBuilder(sc.nextLine());
            if (i != cases) {
                System.out.println(sb.reverse());
            } else {
                System.out.print(sb.reverse());
                return;
            }
        }
    }
}
