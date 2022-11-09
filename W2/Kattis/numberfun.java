package W2.Kattis;

import java.util.Scanner;

public class numberfun {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numTestCase = scan.nextInt();
        for (int i = 0; i < numTestCase; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            if ((x + y == z) || (Math.abs(x - y) == z) || (x * y == z) || ((float) x / y == z)
                    || ((float) y / x == z)) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
