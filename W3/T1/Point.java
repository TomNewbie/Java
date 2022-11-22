public class Point {
    public int x = 0;
    public int y = 0;

    // a constructor!
    public Point(int a, int b) {
        x = a;/* ww w. jav a 2s .c om */
        y = b;
    }

    public String toString() {
        return "x: " + x + " y: " + y;
    }

    public boolean equals(Object pts) {
        if (!(pts instanceof Point))
            return false;
        Point pts1 = (Point) pts;
        if (pts1.x == this.x && pts1.y == this.y)
            return true;
        return false;
    }
}
