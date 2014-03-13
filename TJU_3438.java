import java.util.PriorityQueue;
import java.util.Scanner;

public class TJU_3438 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int stones = sc.nextInt();
            long sum = 0;
            PriorityQueue<Integer> q = new PriorityQueue<Integer>();
            for (int k = 0; k < stones; k++) {
                q.add(sc.nextInt());
            }
            while (q.size() != 1) {
                int cur = q.poll();
                int rent = q.poll();
                sum += cur + rent;
                q.add(cur + rent);
            }
            System.out.println(sum);

        }
    }
}
