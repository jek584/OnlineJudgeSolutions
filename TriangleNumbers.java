import java.util.Scanner;
/**
 * Created by Admin on 12/23/2014.
 */
public class TriangleNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int z = 0; z<  tc; z++){
            long n = sc.nextLong();
            if(n%2 == 1){
                System.out.println(2);
            } else if(n%4 == 0) {
                System.out.println(3);
            } else {
                System.out.println(4);
            }
    }

    }
}
