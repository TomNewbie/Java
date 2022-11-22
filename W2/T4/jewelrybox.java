package W2.Kattis;

import java.util.Scanner;

public class jewelrybox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testcase = scan.nextInt();
        for (int i = 0; i < testcase; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            double height = (x + y - Math.sqrt(Math.pow(x + y, 2) - 3 * x * y)) / 6;
            System.out.println(height * (x - 2 * height) * (y - 2 * height));
        }
        scan.close();
    }
}
