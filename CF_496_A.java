import java.util.Scanner;
/**
 * Created by Admin on 12/17/2014.
 */
public class CF_496_A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        int replaceIndex = 1;
        int min = 1000000;
        int max = 0;
        for(int i = 0 ; i < n-2; i++){
            if(nums[i+2]-nums[i] < min){
                replaceIndex = i+1;
                min = nums[i+2]-nums[i];
            }
        }
        nums[replaceIndex] = nums[replaceIndex-1];
        for(int i = 0; i < n-1; i++){
            max = Math.max(max, nums[i+1]-nums[i]);
        }
        System.out.println(max);
    }
}
