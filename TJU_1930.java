import java.util.ArrayList;
import java.util.Scanner;

public class TJU_1930 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            ArrayList<Integer> currentLine = new ArrayList<Integer>();
            for (int i = 0; i < 16; i++) {
                int cur = sc.nextInt();
                if (cur == 0) {
                    break;
                }
                if (cur == -1) {
                    System.exit(0);
                }
                currentLine.add(cur);
            }
            int doubleCount = 0;
            for (int i = 0; i < currentLine.size(); i++) {
                int num = currentLine.get(i);
                for (int k = 0; k < currentLine.size(); k++) {
                    if (currentLine.get(k) == 2 * num) {
                        doubleCount++;
                    }
                }
            }
            System.out.println(doubleCount);
        }
    }
}
