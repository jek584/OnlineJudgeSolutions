import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a description of class l here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class TJU_1911 {
    public static void main (String[] args) {
        ArrayList<Character> vow = new ArrayList<Character>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            boolean accept = true;
            int totalVowels = 0;
            String cur = sc.next();
            int consCount = 0;
            int vowCount = 0;
            if (cur.equals("end")) {
                break;
            }
            // check consecutives
            for (int i = 0; i < cur.length(); i++) {
                if (vow.contains(cur.charAt(i))) {
                    consCount = 0;
                    vowCount++;
                    totalVowels++;
                } else {
                    vowCount = 0;
                    consCount++;
                }
                if (consCount > 2 || vowCount > 2) {
                    accept = false;
                }
            }
            // check totalVowels
            if (totalVowels < 1) {
                accept = false;
            }
            // check e's and o's
            for (int i = 0; i < cur.length() - 1; i++) {
                if (cur.charAt(i) == cur.charAt(i + 1) && cur.charAt(i) != 'o'
                        && cur.charAt(i) != 'e') {
                    accept = false;
                }
            }
            if (accept) {
                System.out.println("<" + cur + ">" + " is acceptable.");
            } else {
                System.out.println("<" + cur + ">" + " is not acceptable.");
            }

        }
    }
}
