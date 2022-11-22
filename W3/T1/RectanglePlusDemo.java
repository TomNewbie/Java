public class RectanglePlusDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point1 = new Point(8, 4);
        Point point2 = new Point(9, 1);

        RectanglePlus rec1 = new RectanglePlus();
        System.out.println("First RectanglePlus: ");
        System.out.println(rec1.toString());

        System.out.println("Area: " + rec1.getArea());
        System.out.println("--------------------------");
        RectanglePlus rec2 = new RectanglePlus(point1, 5, 3);
        System.out.println("Second RectanglePlus: ");
        System.out.println(rec2.toString());

        System.out.println("Area: " + rec2.getArea());
        System.out.println("--------------------------");

        RectanglePlus rec3 = new RectanglePlus(point2, 8, 6);
        System.out.println("Third RectanglePlus: ");
        System.out.println(rec3.toString());
        System.out.println("Area: " + rec3.getArea());

        rec3.moveRectangle(17, 8);
        System.out.println("Third RectanglePlus: ");
        System.out.println(rec3.toString());

        System.out.print("Rec 3 is larger than Rec 2? ");
        if (rec3.isLargerThan(rec2) == 1) {
            System.out.println("yes");
        } else
            System.out.println("no");
        System.out.println("--------------------------");
        RectanglePlus rec4 = (RectanglePlus) rec3.clone();
        System.out.println(rec4.toString());

        System.out.println("Rec 4 is equal Rec3? " + rec4.equals(rec3));
        System.out.println("Class type of object rec3: " +
                rec3.getClass().getSimpleName());
        System.out.println("Hash code of rec3: " + rec3.hashCode());
        System.out.println("String representation of rec3: " + rec3.toString());
    }
}
