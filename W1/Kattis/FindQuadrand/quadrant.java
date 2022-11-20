
/** 
* Advanced Object Oriented Programming with Java, WS 2018 
* Problem: Problem E Quadrant Selection
* Link:https://open.kattis.com/contests/mjt68e/problems/quadrant
* @author Ferid Gökkaya
* @version 1.0, 2022-10-27 
* 
* Method : Ad-Hoc 
* Status : Accepted 
* Runtime: 0.102 
*/
import java.util.*;

public class quadrant {

    public static void main(String[] args) {
        double x, y;
        Scanner sc = new Scanner(System.in);
        do {
            x = sc.nextDouble();
        } while ((x > 1000 || x < -1000));

        do {

            y = sc.nextDouble();
        } while (y > 1000 || y < -1000);

        if (x > 0 && y > 0) {
            System.out.print("1");
        }
        if (x < 0 && y > 0) {
            System.out.print("2");
        }
        if (x < 0 && y < 0) {
            System.out.print("3");
        }
        if (x > 0 && y < 0) {
            System.out.print("4");
        }
    }

}
