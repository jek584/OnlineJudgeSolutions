import java.util.Scanner;

/**
 * Created by Admin on 12/17/2014.
 */
public class TJU_2967 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int c = sc.nextInt();
            if(c == -1){
                break;
            }
            if(c == 1){
                printTri(sc.nextInt());
            } else if(c==2){
                printPar(sc.nextInt(), sc.nextInt());
            } else {
                printRect(sc.nextInt(), sc.nextInt());
            }
        }
    }
    public static void printTri(int height){
        for(int i  = 0 ; i < height; i++){
            for(int j = 0 ; j < height-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 1+2*i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printRect(int width, int height){
        for (int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printPar(int width, int height){
        for(int i = 0 ; i < height; i++){
            for(int j = 0; j < height-i-1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < width; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}
