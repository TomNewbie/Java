import java.util.Scanner;
import java.util.*;

interface Shape {
    public boolean checkBelong(int x_test, int y_test);
}

class Rectangle implements Shape {
    private int x_bottomLeft;
    private int y_bottomLeft;
    private int x_topRight;
    private int y_topRight;

    public Rectangle (int x1, int y1, int x2, int y2) {
        this.x_bottomLeft = x1;
        this.y_bottomLeft = y1;
        this.x_topRight = x2;
        this.y_topRight = y2;
    }

    public boolean checkBelong (int x_test,int y_test) {
        if ((x_bottomLeft <= x_test && x_test <= x_topRight) && (y_bottomLeft <= y_test && y_test <= y_topRight)) {
            return true;
        } else {
            return false;
        } 
    }
}

class Circle implements Shape {
    private int x_center;
    private int y_center;
    private int radian;

    public Circle(int x_center, int y_center, int radian) {
        this.x_center = x_center;
        this.y_center = y_center;
        this.radian = radian;
    }

    public boolean checkBelong (int x_test, int y_test) {
        
        // formula to check the point in circle
        // (x-x0)^2 + (y-y0)^2 <= (radian)^2
        double left_equation_Circle1 = (x_test - this.x_center) * (x_test - this.x_center);
        double left_equation_Circle2 = (y_test - this.y_center) * (y_test - this.y_center);
        double right_equation_Circle = radian *radian;
        if (left_equation_Circle1 + left_equation_Circle2 <= right_equation_Circle) {
            return true;
        } else {
            return false;
        }
    }
}

public class hittingTheTargets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetsNum = sc.nextInt();
        List<Shape> targetsList = new ArrayList<Shape>();
        for (int i = 0; i < targetsNum; i++) {
            String targetShape = sc.next();
            if (targetShape.equals("rectangle")) {
                int x_bottomLeft = sc.nextInt();
                int y_bottomLeft = sc.nextInt();
                int x_topRight = sc.nextInt();
                int y_topRight = sc.nextInt();
                targetsList.add(new Rectangle(x_bottomLeft, y_bottomLeft, x_topRight, y_topRight));
            } else if (targetShape.equals("circle")) {
                int x_center = sc.nextInt();
                int y_center = sc.nextInt();
                int radian = sc.nextInt();
                targetsList.add(new Circle(x_center,y_center,radian));
            }
        }

        int hitsNum = sc.nextInt();
        for (int i = 0; i < hitsNum; i++) {
            int x_test = sc.nextInt();
            int y_test = sc.nextInt();
            int targetHit = 0;
            for (int j = 0; j < targetsList.size(); j++) {
                if (targetsList.get(j).checkBelong(x_test,y_test)) {
                    targetHit++;
                }
            }
            System.out.println(targetHit);
        }
        sc.close();
    }
}
