import java.util.Scanner;
/**
 * Created by Admin on 12/24/2014.
 */
public class CF_499_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int cur = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            int begin = sc.nextInt()-1;
            int end = sc.nextInt()-1;
            while(cur+x <= begin){
                cur+=x;
            }
            ans+=begin-cur+end-begin+1;
            cur=end+1;
        }
        System.out.println(ans);
    }
}
