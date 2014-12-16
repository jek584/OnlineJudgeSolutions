import java.awt.geom.Line2D;
import java.util.Scanner;
import java.awt.geom.Line2D.Double;
/**
 * Created by Admin on 12/16/2014.
 */
public class JimBeam {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int z = 0; z < tc; z++){
            Line2D.Double lineA = new Line2D.Double(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            Line2D.Double lineB = new Line2D.Double(0, 0, sc.nextInt(), sc.nextInt());
            if(lineA.intersectsLine(lineB)){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
