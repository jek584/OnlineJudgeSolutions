import java.util.Scanner;
/**
 * Created by Admin on 12/15/2014.
 */
public class TheGridSearch {
    public static int[][] bigMat, smallMat;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int z = 0; z < tc; z++){
            bigMat = new int[sc.nextInt()][sc.nextInt()];
            sc.nextLine();
            for(int i = 0 ; i < bigMat.length; i++){
                String cur = sc.nextLine();
                for(int j = 0 ; j < cur.length(); j++){
                    bigMat[i][j] = cur.charAt(j)-'0';
                }
            }
            smallMat = new int[sc.nextInt()][sc.nextInt()];
            sc.nextLine();
            for(int i = 0 ; i < smallMat.length; i++){
                String cur = sc.nextLine();
                for(int j = 0 ; j < cur.length(); j++){
                    smallMat[i][j] = cur.charAt(j)-'0';
                }
            }
            boolean found = false;
            for(int i = 0; i <= bigMat.length-smallMat.length; i++){
                for(int j = 0 ; j <= bigMat[0].length - smallMat[0].length; j++){
                    if(works(i, j)){
                        found = true;
                        break;
                    }
                }
                if(found){
                    break;
                }
            }
            String ans;
            if(found){
                ans = "YES";
            } else {
                ans = "NO";
            }
            System.out.println(ans);
        }
    }
    public static boolean works(int x, int y){
        for(int i = 0; i < smallMat.length; i++){
            for(int j = 0 ; j < smallMat[0].length; j++){
               if(smallMat[i][j] != bigMat[i+x][j+y]){
                   return false;
               }
            }
        }
        return true;
    }
}
