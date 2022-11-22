
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Jabuke
* Link: https://open.kattis.com/contests/mjt68e/problems/jabuke
* @author Tho Phan Chi
* @version 1.0,2022-10-27
* 
* Method : Algebra
* Run-time: 0.15
* Status : Accepted
*/

import java.lang.Math;
import java.util.*;
// import java.util.Scanner;

public class Jabuke {
    static class Coord {
        public double x;
        public double y;

        public Coord(double x, double y) {
            this.x = x;
            this.y = y;
        }

        // Calculate vector coordinate given 2 Point
        static Coord vector(Coord A, Coord B) {
            return new Coord(B.x - A.x, B.y - A.y);
        }

        // Calculate Area given 2 vector, see cross product for more information
        static double Area(Coord A, Coord B) {
            return Math.abs(Coord.determinant(A, B) / 2);
        }

        // Calculate determinant of 2 vector
        static double determinant(Coord A, Coord B) {
            return A.x * B.y - A.y * B.x;
        }

        void printCoor() {
            System.out.println("x: " + x + " y: " + y);
        }

        // Triangle Interior
        static boolean checkInsideTriangle(Coord X, Coord AB, Coord AC) {
            double a = Coord.determinant(X, AC) / Coord.determinant(AB, AC);
            double b = Coord.determinant(AB, X) / Coord.determinant(AB, AC);
            if (a >= 0 && b >= 0 && a + b <= 1) {
                return true;
            } else
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Coord> triangle_coor = new ArrayList<Coord>();
        for (int i = 0; i < 3; i++) {
            Double x = scan.nextDouble();
            Double y = scan.nextDouble();
            triangle_coor.add(new Coord(x, y));
        }
        // Create vector AB and AC
        Coord AB = Coord.vector(triangle_coor.get(0), triangle_coor.get(1));
        Coord AC = Coord.vector(triangle_coor.get(0), triangle_coor.get(2));
        int numPoint = scan.nextInt();
        int count = 0;
        for (int i = 0; i < numPoint; i++) {
            Double x = scan.nextDouble();
            Double y = scan.nextDouble();
            // Create vector AD
            Coord AD = new Coord(x - triangle_coor.get(0).x, y - triangle_coor.get(0).y);
            if (Coord.checkInsideTriangle(AD, AB, AC)) {
                count++;
            }
        }
        scan.close();

        System.out.println(Coord.Area(AC, AB));

        System.out.println(count);
    }
}
