
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Different Distances
* Link: https://open.kattis.com/contests/mjt68e/problems/differentdistances
* @author Tho Phan Chi
* @version 1.0,2022-10-27
* 
* Method : Algebra
* Run-time: 0.45
* Status : Accepted
*/
import java.util.Scanner;
import java.lang.Math;

public class differentdistances {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = scan.nextDouble();
        while (x1 != 0.0) {
            double y1 = scan.nextDouble();
            double x2 = scan.nextDouble();
            double y2 = scan.nextDouble();
            double p = scan.nextDouble();
            System.out.println(Math.pow(Math.pow(Math.abs(x1 - x2), p) + Math.pow(Math.abs(y1 - y2), p), 1 / p));
            x1 = scan.nextDouble();
        }
        scan.close();

    }
}
