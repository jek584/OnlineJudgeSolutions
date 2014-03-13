import java.util.Scanner;
// simple bucket sort implementation to print out a person's rank in the class
// given their grade and everyone elses's as INTS

public class rank {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int[] buckets = new int[101];
        int john = sc.nextInt();
        for (int i = 0; i < cases - 1; i++) {
            buckets[sc.nextInt()]++;
        }
        int rank = 1;
        for (int i = 100; i > -1; i--) {
            if (i == john) {
                System.out.println(rank);
                return;
            }
            rank += buckets[i];
        }
    }
}
