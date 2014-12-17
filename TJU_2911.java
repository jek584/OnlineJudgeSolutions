import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 * Created by Admin on 12/17/2014.
 */
public class TJU_2911 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i  = 0; i < n; i ++){
            map.put(sc.next(), sc.next());
        }
        for(int i = 0 ; i < k; i++){
            String cur = sc.next();
            if(map.containsKey(cur)){
                System.out.println(map.get(cur));
            } else if(((cur.charAt(cur.length()-1) == 'y') && !(vowels.contains(cur.charAt(cur.length()-2))))){
                System.out.println(cur.substring(0, cur.length()-1)+"ies");
            } else if(cur.endsWith("o") || cur.endsWith("s") || cur.endsWith("ch") || cur.endsWith("sh") || cur.endsWith("x")){
                System.out.println(cur +  "es");
            } else {
                System.out.println(cur+"s");
            }
        }
    }
}
