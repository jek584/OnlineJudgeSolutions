import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// TJU 1605, solved using modified flood fill
public class TJU_1605 {
    static int counter = 0;

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        sc.nextLine();
        int trial = 0;
        while (!(w == 0 && h == 0)) {
            trial++;
            System.out.println("Throw " + trial);
            char[][] pic = new char[h][w];
            for (int i = 0; i < h; i++) {
                char[] line = sc.nextLine().toCharArray();
                pic[i] = line;
            }
            ArrayList<Integer> output = new ArrayList<Integer>();
            for (int x = 0; x < h; x++) {
                for (int y = 0; y < w; y++) {
                    if (pic[x][y] == '*') {
                        counter = 0;
                        dots(pic, x, y);
                        if (counter != 0) {
                            output.add(counter);
                        }
                    }
                }
            }

            Collections.sort(output);
            for (int i = 0; i < output.size(); i++) {
                System.out.print(output.get(i));
                System.out.print((i < output.size() - 1) ? " " : "");
            }
            System.out.println("\n");

            w = sc.nextInt();
            h = sc.nextInt();
            sc.nextLine();
        }
    }

    public static void dots (char[][] pic, int x, int y) {
        // printPicture(pic);

        if ((x < pic.length) && (x >= 0) && (y < pic[0].length) && (y >= 0)) {
            if (pic[x][y] != '.') {
                if (pic[x][y] == 'X') {
                    counter++;
                    xFill(pic, x, y);
                }
                pic[x][y] = '.';

                dots(pic, x + 1, y); // Go right
                dots(pic, x - 1, y); // Go left
                dots(pic, x, y + 1); // Go down
                dots(pic, x, y - 1); // Go up
            }
        }
    }

    private static void xFill (char[][] pic, int x, int y) {
        if ((x < pic.length) && (x >= 0) && (y < pic[0].length) && (y >= 0)) {
            if (pic[x][y] == 'X') {
                pic[x][y] = '.';

                xFill(pic, x + 1, y); // Go right
                xFill(pic, x - 1, y); // Go left
                xFill(pic, x, y + 1); // Go down
                xFill(pic, x, y - 1); // Go up
            }
        }
        // printPicture(pic);
    }

    private static void printPicture (char[][] pic) {
        for (int i = 0; i < pic.length; i++) {
            for (int j = 0; j < pic[0].length; j++) {
                System.out.print(pic[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
