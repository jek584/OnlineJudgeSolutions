import java.util.Scanner;

/**
 * Created by Admin on 12/20/2014.
 */
public class ChocolateFiesta {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOdd = 0, numEven = 0;
        for(int i = 0; i < n; i++){
            if(sc.nextInt()%2==0){
                numEven++;
            } else {
                numOdd++;
            }
        }
        System.out.println(ans(numEven, numOdd));
    }
    public static long ans(long numEven, long numOdd){
        if(numOdd>0){
            numOdd--;
        }
        long ans = ans(numEven+numOdd);
        return ans;
    }
    public static long ans(long n){
        long t = 2;
        for(long i = 1; i < n; i++){
            t= (t*2)%1000000007;
        }
        return t-1;
    }
}