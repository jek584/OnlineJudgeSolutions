import java.util.Scanner;
/**
 * Created by Admin on 12/16/2014.
 */
public class RectangularGame {
    public static class Rectangle{
        int x, y;
        public Rectangle(int x, int y){
            this.x = x;
            this.y = y;
        }
        public Rectangle intersection(Rectangle r){
            return new Rectangle(Math.min(x, r.x), Math.min(y, r.y));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Rectangle cur = new Rectangle(1000000, 1000000);
        for(int i = 0 ; i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            //Rectangle t = new Rectangle(x, y);
            //System.out.println(1L*cur.width*cur.height);
            cur = cur.intersection(new Rectangle(x, y));
        }
        System.out.println(1L*cur.x*cur.y);
    }

}
