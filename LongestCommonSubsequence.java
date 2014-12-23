import java.util.Scanner;
/**
 * Created by Admin on 12/23/2014.
 */
public class LongestCommonSubsequence {
    public static int[] a, b;
    public static int n, m;
    public static int[][] memo;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[n+1];
        b = new int[m+1];
        memo = new int[n+1][m+1];
        for(int i = 1;i <= n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 1; i <= m; i++){
            b[i] = sc.nextInt();
        }
        fillMemo();
        System.out.println(lcs(n, m).substring(1));
    }
    public static void fillMemo(){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(a[i] == b[j]){
                    memo[i][j] = memo[i-1][j-1]+1;
                } else {
                    memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
                }
            }
        }
    }
    public static String lcs(int i, int j){
        if(i*j==0){
            return "";
        }
        if(a[i] == b[j]){
            return lcs(i-1, j-1) + " " + a[i];
        }
        if(memo[i][j-1] > memo[i-1][j]){
            return lcs(i, j-1);
        }
        return lcs(i-1, j);
    }
}
