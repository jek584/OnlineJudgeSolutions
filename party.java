import java.util.PriorityQueue;
import java.util.Scanner;

public class party {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt(), guests, i, j, c;
        long a, b;
        PriorityQueue<Long> beginTimes;
        PriorityQueue<Long> endTimes;
        // for each case
        for (c = 0; c < cases; c++) {
            //
            guests = sc.nextInt();
            beginTimes = new PriorityQueue<Long>();
            endTimes = new PriorityQueue<Long>();

            for (i = 0; i < guests; i++) {
                a = sc.nextLong();
                b = sc.nextLong();

                beginTimes.add(a);
                endTimes.add(a + b);
            }

            int currentChairs = 0;
            long starting = 0;
            long ending = 0;
            int max = 0;
            long present = 0;
            boolean flag = true;

            while (!beginTimes.isEmpty() || !endTimes.isEmpty()) {

                if (!beginTimes.isEmpty()
                        && beginTimes.peek() <= endTimes.peek()) {
                    currentChairs++;
                    if (currentChairs > max)
                        max = currentChairs;
                    present = beginTimes.poll();
                    starting = present;
                    ending = present;
                } else {
                    currentChairs--;
                    present = endTimes.poll();
                    ending = present;
                }
            }

            System.out.println(max);
        }
    }
}
