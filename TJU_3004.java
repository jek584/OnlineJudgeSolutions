import java.util.Scanner;

// tju 3004
public class TJU_3004 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int index = sc.nextInt();
            StringBuilder word = new StringBuilder(sc.next());
            word.replace(index - 1, index, "");
            System.out.println(i + 1 + " " + word);
        }
    }
}
