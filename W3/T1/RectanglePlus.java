
public class RectanglePlus
        implements Relatable, Cloneable {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }

    public RectanglePlus(Point p) {
        origin = p;
    }

    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // a method for moving center the rectangle
    public void moveRectangle(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }

    // a method required to implement
    // the Relatable interface
    public int isLargerThan(Relatable other) {
        RectanglePlus otherRect = (RectanglePlus) other;
        if (this.getArea() < otherRect.getArea())
            return -1;
        else if (this.getArea() > otherRect.getArea())
            return 1;
        else
            return 0;
    }

    public boolean equals(Object rec) {
        if (!(rec instanceof RectanglePlus))
            return false;
        RectanglePlus rec1 = (RectanglePlus) rec;
        return rec1.hashCode() == this.hashCode();
        // if (rec1.height == this.height && rec1.width == this.width &&
        // rec1.origin.equals(this.origin))
        // return true;
        // return false;
    }

    public int hashCode() {
        // 37 is magic number to hash :))
        return 37 * (37 * (37 * height + width) + origin.x) + origin.y;
    }

    public String toString() {
        return "Origin: " + origin.toString() + " height: " + height + " width: " + width;
    }
}
