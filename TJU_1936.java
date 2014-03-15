import java.util.Scanner;

public class TJU_1936 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int maxX = sc.nextInt();
            if (maxX == 0) {
                return;
            }
            int bigX = 0;
            int bigY = 0;
            int sumY = 0;
            int curX = 0;
            while (true) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                // if end, break.
                if (x == -1) {
                    sumY += bigY;
                    if (curX > bigX) {
                        bigX = curX;
                    }
                    break;
                }
                // if at the end of the line, start new one
                if (curX + x > maxX) {
                    if (curX > bigX) {
                        bigX = curX;
                    }
                    curX = x;
                    sumY += bigY;
                    bigY = y;
                }
                // if not, continue on.
                else {
                    curX += x;
                }
                if (y > bigY) {
                    bigY = y;
                }
            }
            System.out.println(bigX + " x " + sumY);
        }
    }
}
