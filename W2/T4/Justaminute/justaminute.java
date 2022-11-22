import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2022
 * Problem: Problem M Just a Minute
 * Link: https://open.kattis.com/contests/ggi5da/problems/justaminute
 * 
 * @author Ferid Gökkaya
 * @version 1.0, 2022-11-02
 *          Method : Ad-Hoc
 *          Status : Accepted
 *          Runtime: 0.102
 */

public class justaminute {
    public static double calc(int sec, int min) {
        double a = (double) sec;
        double b = (double) min;
        double num = a / b;
        return num;
    }

    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        int plot = numbers.nextInt();
        int minimum = 0;
        int seconds = 0;
        while (plot-- > 0) {
            minimum += numbers.nextInt() * 60;
            seconds += numbers.nextInt();
        }

        if (minimum >= seconds) {
            System.out.println("measurement error");
        } else {
            System.out.printf("%.9f", calc(seconds, minimum));
        }

    }
}
