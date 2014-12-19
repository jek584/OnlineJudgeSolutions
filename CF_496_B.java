import java.util.Scanner;

/**
 * Created by Admin on 12/17/2014.
 */
public class CF_496_B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        String line = sc.next();
        for(int i = 0; i < n; i++){
            nums[i] = line.charAt(i)-'0';
        }
        StringBuilder sb = new StringBuilder(n);
        for(int i = 0; i < n; i++){
            sb.append("9");
        }
        String min = sb.toString();
        StringBuilder temp;
        String comp;
        for(int i = 0; i < n; i++){
            temp = new StringBuilder(n);
            int offSet = (10-nums[i])%10;
            temp.append("0");
            for(int j = 1; j < n; j++){
                temp.append(((nums[(i+j)%n]+offSet)%10)+"");
            }
            comp = temp.toString();
            if(min.compareTo(comp)> 0){
                min = comp;
            }
        }
        System.out.println(min);
    }
}
