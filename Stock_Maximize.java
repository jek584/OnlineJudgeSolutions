/**
 * Created by Admin on 12/21/2014.
 */
import java.io.*;
import java.util.PriorityQueue;

public class Stock_Maximize {
    private static class nodo implements Comparable<nodo>{
        int val, index;
        public nodo(int id, int v){
            this.val = v;
            this.index = id;
        }
        public int compareTo(nodo o){
            if(this.val-o.val == 0){
                return this.index-o.index;
            }
            return (this.val-o.val)*-1;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        for(int z = 0; z < tc; z++) {
            int n = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int[] maxDiff = new int[n];
            PriorityQueue<nodo> pq = new PriorityQueue<nodo>();
            for (int i = 0; i < n; i++) {
                pq.add(new nodo(i, Integer.parseInt(line[i])));
            }
            int cur = 0;
            long ans = 0;
            for (int i = 0; i < n; i++) {
                cur = Integer.parseInt(line[i]);
                while (pq.peek().index < i) {
                    pq.poll();
                }
                ans += Math.max(pq.peek().val - cur, 0);
            }
            System.out.println(ans);
        }
    }
}
