import java.util.Scanner;

/**
 * Created by Admin on 12/24/2014.
 */
public class CF_499_C {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x1 = sc.nextInt();
        long y1 = sc.nextInt();
        long x2 = sc.nextInt();
        long y2 = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++){
            long a, b, c;
            a = sc.nextLong();b=sc.nextLong();c=sc.nextLong();
            if(sign(x1, y1, a, b, c)!=sign(x2, y2, a, b ,c)){
                ans++;
            }
        }
        System.out.println(ans);

    }
    public static int sign(long x1, long y1, long a, long b, long c){
        return (a*x1+b*y1+c) > 0 ? 1 : -1;
    }
}