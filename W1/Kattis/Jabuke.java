package Kattis;

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

        static Coord vector(Coord A, Coord B) {
            return new Coord(B.x - A.x, B.y - A.y);
        }

        // static double Area(Coord A, Coord B, Coord C) {
        // return Math.abs(A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) /
        // 2;
        // }
        static double Area(Coord A, Coord B) {
            return Math.abs(Coord.determinant(A, B) / 2);
        }

        static double determinant(Coord A, Coord B) {
            return A.x * B.y - A.y * B.x;
        }

        void printCoor() {
            System.out.println("x: " + x + " y: " + y);
        }

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
        Coord AB = Coord.vector(triangle_coor.get(0), triangle_coor.get(1));
        Coord AC = Coord.vector(triangle_coor.get(0), triangle_coor.get(2));
        int numPoint = scan.nextInt();
        int count = 0;
        for (int i = 0; i < numPoint; i++) {
            Double x = scan.nextDouble();
            Double y = scan.nextDouble();
            Coord D = new Coord(x - triangle_coor.get(0).x, y - triangle_coor.get(0).y);
            if (Coord.checkInsideTriangle(D, AB, AC)) {
                count++;
            }
        }
        scan.close();

        System.out.println(Coord.Area(AC, AB));

        System.out.println(count);
    }
}
