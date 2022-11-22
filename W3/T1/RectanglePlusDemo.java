public class RectanglePlusDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point1 = new Point(8, 4);
        Point point2 = new Point(9, 1);

        RectanglePlus rec1 = new RectanglePlus();
        System.out.println("First RectanglePlus: ");
        rec1.printRectangle();
        System.out.println("Area: " + rec1.area_calc());

        RectanglePlus rec2 = new RectanglePlus(point1, 5, 3);
        System.out.println("Second RectanglePlus: ");
        rec2.printRectangle();
        System.out.println("Area: " + rec2.area_calc());

        RectanglePlus rec3 = new RectanglePlus(point2, 8, 6);
        System.out.println("Third RectanglePlus: ");
        rec3.printRectangle();
        System.out.println("Area: " + rec3);

        rec3.moveRectangle(17, 8);
        System.out.println("Third RectanglePlus:");
        rec3.printRectangle();

        System.out.println("Rec 3 is larger than Rec 2?" + rec3.isLargerThan(rec2));

        RectanglePlus rec4 = (RectanglePlus) rec3.clone();
        rec4.printRectangle();

        System.out.println("Rec 4 is equal Rec3?" + rec4.equal(rec3));
        System.out.println("Class type of object rec3: " + rec3.getClass().getSimpleName());
        System.out.println("Hash code of rec3: " + rec3.hashCode());
        System.out.println("String representation of rec3: " + rec3.toString());
    }
}
