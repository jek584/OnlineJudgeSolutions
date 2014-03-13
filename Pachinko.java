import java.util.Scanner;
import java.util.regex.Pattern;

public class Pachinko {
    public static double analyze (int i, String s) {
        char cur = s.charAt(i);
        if (cur == '_') {
            return 0;
        }
        if (cur == '/') {
            return analyzeWallLeft(i - 1, s);
        }
        if (cur == '|') {
            return (analyzeWallLeft(i - 1, s) + analyzeWallRight(i + 1, s)) / 2;
        }
        if (cur == Pattern.quote("\\").charAt(0)) {
            return analyzeWallRight(i + 1, s);
        }
        return 10;

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = ".";
            line += sc.nextLine();
            line += ".";
            if (line.equals(".#.")) {
                break;
            }
            double sum = 0;
            for (int i = 1; i < line.length() - 1; i++) {
                sum += analyze(i, line);
            }
            sum *= 10.0;
            sum /= (double) (line.length() - 2);
            int out = (int) Math.floor(sum);
            System.out.println(out);
        }
    }

    public static double analyzeWallRight (int i, String s) {
        for (int j = i; j < s.length(); j++) {
            if (s.charAt(j) == '.') {
                return 10;
            }
            if (s.charAt(j) == '\\'
                    || s.charAt(j) == Pattern.quote("/").charAt(0)
                    || s.charAt(j) == '|') {
                return 0;
            }
            // if (j == s.length() - 2) {
            // return 0;
            // }
        }
        return -1;
    }

    public static double analyzeWallLeft (int i, String s) {
        for (int j = i; j > -1; j--) {
            if (s.charAt(j) == '.') {
                return 10;
            }
            if (s.charAt(j) == '\\'
                    || s.charAt(j) == Pattern.quote("/").charAt(0)
                    || s.charAt(j) == '|') {
                return 0;
            }
        }
        return -1;
    }

}
