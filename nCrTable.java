import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 12/19/2014.
 */
public class nCrTable {
    public static long[][] mat = new long[1001][];
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        mat[0] = new long[3];
        mat[0][1] = 1;
        for(int i = 1; i < 1001; i++){
            mat[i] = new long[i+3];
            for(int j = 1; j < mat[i].length-1; j++){
                mat[i][j] = (mat[i-1][j-1]+mat[i-1][j])%1000000000;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int z = 0; z < tc; z++){
            int n = sc.nextInt();
            for(int i = 1; i <= n+1; i++){
                bw.write(mat[n][i]+"");
                if(i != n+1){
                    bw.write(" ");
                }
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        sc.close();
    }
}
