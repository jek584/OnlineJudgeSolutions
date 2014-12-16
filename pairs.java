import java.util.Scanner;
import java.util.HashMap;
/**
 * Created by Admin on 12/15/2014.
 */
public class pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        long ans = 0;
        long cur;
        for(int i = 0 ; i < n; i++){
            cur = sc.nextLong();
            if(map.containsKey(cur)){
                map.put(cur, map.get(cur)+1);
            } else {
                map.put(cur, 1);
            }
            if(map.containsKey((cur-k))){
                ans+=map.get(cur-k);
            }
            if(map.containsKey(cur+k)){
                ans+=map.get(cur+k);
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
