import java.util.Scanner;

public class TJU_1962 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String line = sc.nextLine();
            if (line.equals("0")) {
                break;
            }
            int sum = 0;
            for (int i = 0, power = line.length(); i < power; i++) {
                sum += (int) ((Math.pow(2, power - i) - 1) * Character
                        .getNumericValue(line.charAt(i)));
            }
            System.out.println(sum);
        }
    }
}
