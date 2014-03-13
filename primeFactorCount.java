import java.util.Scanner;

public class primeFactorCount {
    // siv the number of prime factors of all numbers using magic.
    // not the most effective method but it works well enough
    public static int[] gen () {
        int[] siv = new int[1000001];

        for (int i = 2; i < 1000001; i++) {
            if (siv[i] == 0) {
                for (int j = i; j < 1000001; j += i) {
                    siv[j]++;
                }
            }
        }
        return siv;
    }

    public static void main (String[] args) {
        int[] pool = gen();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int curNum = sc.nextInt();
            if (curNum == 0) {
                break;
            }
            System.out.println(curNum + " : " + pool[curNum]);
        }
    }
}
