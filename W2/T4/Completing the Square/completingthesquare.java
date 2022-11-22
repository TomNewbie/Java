// package T4;

import java.util.Scanner;

public class completingthesquare {
    static class Coord {
        public int x;
        public int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        static void findCoord(Coord A, Coord B, Coord C) {
            int x = A.x + B.x - C.x;
            int y = A.y + B.y - C.y;
            System.out.println(x + " " + y);
        }

        static double distance(Coord A, Coord B) {
            return Math.sqrt(Math.pow((A.x - B.x), 2) + Math.pow((A.y - B.y), 2));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Coord A = new Coord(scan.nextInt(), scan.nextInt());
        Coord B = new Coord(scan.nextInt(), scan.nextInt());
        Coord C = new Coord(scan.nextInt(), scan.nextInt());
        double AB = Coord.distance(A, B);
        double AC = Coord.distance(A, C);
        double BC = Coord.distance(B, C);
        double max = Math.max(Math.max(AB, AC), BC);
        if (max == AB) {
            Coord.findCoord(A, B, C);
        } else if (max == AC) {
            Coord.findCoord(A, C, B);
        } else {
            Coord.findCoord(B, C, A);
        }
    }
}
