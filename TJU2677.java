import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TJU2677 {
    public static class plot implements Comparable<plot> {
        public int trees;
        // coords describing upper lefthand of plot
        public int x;
        public int y;
        // w = width h = height
        public int w;
        public int h;

        public plot(int x, int y, int w, int h) {
            this.y = y;
            this.x = x;
            this.w = w;
            this.h = h;
        }

        public void treeCount (boolean[][] matrix) {
            for (int i = x; i < w; i++) {
                for (int j = y; j < h; j++) {
                    if (matrix[x][y] == true) {
                        trees++;
                    }
                }
            }
        }

        public int compareTo (plot other) {
            if (this.trees < other.trees) {
                return -1;
            } else if (this.trees > other.trees) {
                return 1;
            } else
                return 0;
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int treeCount = sc.nextInt();
            int gridWidth = sc.nextInt();
            int gridHeight = sc.nextInt();
            if (treeCount == 0) {
                break;
            }
            boolean[][] land = new boolean[gridWidth][gridHeight];
            for (int i = 0; i < treeCount; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                land[x][y] = true;
            }
            int sectionWidth = sc.nextInt();
            int sectionHeight = sc.nextInt();
            ArrayList<plot> plotList = new ArrayList<plot>();
            for (int x = 0; x < gridWidth; x++) {
                for (int y = 0; y < gridHeight; y++) {
                    if (x + sectionWidth < gridWidth
                            && y + sectionHeight < gridHeight) {
                        plot currentPlot = new plot(x, y, sectionWidth,
                                sectionHeight);
                        currentPlot.treeCount(land);
                        plotList.add(currentPlot);
                    }
                }
            }
            Collections.sort(plotList);
            System.out.println(plotList.get(plotList.size()).trees);
        }

    }
}
