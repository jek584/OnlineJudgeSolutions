import java.util.Scanner;

public class TJU_3771 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int min = 290000;
            String s = "";
            for (int j = 0; j < 4; j++) {
                String cur = sc.next();
                int currint = sc.nextInt();
                if (currint < min) {
                    min = currint;
                    s = cur;
                }
            }
            System.out.println("Poor " + s);

        }

    }
}
