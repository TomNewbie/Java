import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2022
 * Problem: Problem K: Pizza Crust
 * Link: https://open.kattis.com/contests/ggi5da/problems/pizza2
 * 
 * @author Ferid Gökkaya
 * @version 1.0, 2022-10-31
 *          Method : Ad-Hoc
 *          Status : Accepted
 *          Runtime: 0.102
 */
public class Pizzacrust {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        double radius = enter.nextDouble();

        double crust = enter.nextDouble();
        double num = Math.pow(radius - crust, 2);
        System.out.println(num / (radius * radius) * 100);
    }

}
