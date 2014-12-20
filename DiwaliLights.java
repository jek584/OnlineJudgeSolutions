import java.io.*;
import java.util.*;

public class DiwaliLights {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println(ans(sc.nextInt()));
        }
    }
    public static int ans(int n){
        int t = 2;
        for(int i = 1; i < n; i++){
            t= (t*2)%100000;
        }
        return t-1;
    }
}