import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Admin on 12/17/2014.
 */
public class CF_496_C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        StringBuilder[] lines = new StringBuilder[n];
        for(int i = 0; i < n; i++){
            lines[i] = new StringBuilder(sc.nextLine());
        }
        int ans = 0;
        boolean[] blocked = new boolean[m];
        if(n != 1){
            for(int i = 0; i < n-1; i++){
                //System.out.println(Arrays.toString(blocked));
                for(int j = 0; j < m; j++){
                    if(!blocked[j]) {

                        if ((int)lines[i].charAt(j) < (int)lines[i + 1].charAt(j)) {
                            break;
                        }
                        if ((int)lines[i].charAt(j) > (int)lines[i + 1].charAt(j)) {
                            blocked[j] = true;
                            ans++;
                            i=-1;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
