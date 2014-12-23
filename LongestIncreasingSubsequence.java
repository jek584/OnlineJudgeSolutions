import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Admin on 12/23/2014.
 */
public class LongestIncreasingSubsequence {
    public static int[] x;
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        x = new int[n];
        for(int i = 0;i < n; i++){
            x[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(lis());
    }
    public static int lis(){
        int[] p = new int[x.length];
        int[] m = new int[x.length+1];
        int max = 0;
        for(int i = 0; i < x.length; i++){
            int low = 1;
            int high = max;
            while(low <= high){
                int mid = (low+high+1)/2;
                if(x[m[mid]] < x[i]){
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }
            int newL = low;
            p[i] = m[newL-1];
            m[newL] = i;
            max = Math.max(max, newL);
        }
        return max;
    }

}
