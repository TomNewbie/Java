import java.util.*;

public class BasicMathDemo {
    public static void main(String[] args) {
        double a = -196.178;
        double b = 95.78;
        int c = 20, d = 58;

        System.out.printf("The absolute value " + "of %.3f is %.3f%n", a, Math.abs(a));

        System.out.printf("The ceiling of " + "%.2f is %.0f%n", b, Math.ceil(b));

        System.out.printf("The floor of " + "%.2f is %.0f%n", b, Math.floor(b));

        System.out.printf("The rint of %.2f " + "is %.0f%n", b, Math.rint(b));

        System.out.printf("The max of %d and " + "%d is %d%n", c, d, Math.max(c, d));

        System.out.printf("The min of of %d " + "and %d is %d%n", c, d, Math.min(c, d));
    }
}
