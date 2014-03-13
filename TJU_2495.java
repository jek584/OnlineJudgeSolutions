import java.util.Scanner;

public class TJU_2495 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int money = sc.nextInt();
            int inc = sc.nextInt();
            int goal = sc.nextInt();
            if (inc == 0) {
                break;
            }
            if (!((Math.abs(money - goal) % inc) == 0)) {
                System.out.println("No accounting tablet");
            } else {
                System.out.println(count(Math.abs(money - goal), inc));
            }
        }
    }

    public static int count (int goal, int inc) {
        int count = 0;
        int incInc = inc;
        while (inc != goal) {
            count++;
            inc += incInc;
        }

           int three = count / 3;
            count %= 3;
        int two = 0;
        if (count % 2 == 0) {
            two = count / 2;
            count %= 2;
        }
        return three + two + count;
    }
}
