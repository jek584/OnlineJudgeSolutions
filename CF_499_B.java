import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Admin on 12/24/2014.
 */
public class CF_499_B {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<String, String> mapA = new HashMap<String, String>();
        HashMap<String, String> mapB = new HashMap<String, String>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 0; i < m; i++){
            String a = sc.next();
            String b = sc.next();
            mapA.put(a, b);
            mapB.put(b, a);
        }
        for(int i  = 0; i < n; i++){
            String cur = sc.next();
            if(mapA.containsKey(cur)){
                String key = mapA.get(cur);
                if (key.length() < cur.length()){
                    bw.write(key);
                } else {
                    bw.write(cur);
                }
            } else {
                String key = mapB.get(cur);
                if (key.length() <= cur.length()){
                    bw.write(key);
                } else {
                    bw.write(cur);
                }
            }
            if(i!=n-1){
                bw.write(" ");
            }
            }
        bw.newLine();
        bw.flush();
        }
}
