// package T4.Bus;

/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Bus
* Link: https://open.kattis.com/contests/ggi5da/problems/bus
* @author Tho Phan Chi
* 
* Method : Math
* Status : Accepted
* Runtime: 0.10
*/
import java.util.Scanner;

public class bus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for (int i = 0; i < testCase; i++) {
            int people = scan.nextInt();
            System.out.println((int) Math.pow(2, people) - 1);
        }
    }
}
