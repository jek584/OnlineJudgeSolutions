import java.util.ArrayList;
import java.util.Scanner;

// Pretty complex sequence problem. solved using bottom up dynamic programming
public class TJU3001_Dominoes {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();

        for (int i = 1; i <= cases; i++) {
            int lol = sc.nextInt();
            if (lol == 1) {
                System.out.println(i + " " + 1);
            } else if (lol == 2) {
                System.out.println(i + " " + 5);

            } else if (lol == 3) {
                System.out.println(i + " " + 11);

            } else if (lol == 4) {
                System.out.println(i + " " + 36);
            } else {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(1);
                list.add(5);
                list.add(11);
                list.add(36);
                for (int j = 0; j < lol - 4; j++) {
                    int next = 0 - list.get(0) + list.get(1) + 5 * list.get(2)
                            + list.get(3);
                    list.remove(0);
                    list.add(next);
                }
                System.out.println(i + " " + list.get(3));
            }
        }
    }
}
