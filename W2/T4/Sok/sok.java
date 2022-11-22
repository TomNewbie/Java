
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: 	Sok
* Link: https://open.kattis.com/contests/ggi5da/problems/sok
* @author Tho Phan Chi
* @version 1.0,2022-10-31
* 
* Status : Accepted
*/
import java.util.Scanner;

public class sok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] amount = new int[3];
        double[] ratio = new double[3];
        double[] d = new double[3];
        for (int i = 0; i < 3; i++) {
            amount[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            ratio[i] = scan.nextDouble();
            d[i] = amount[i] / ratio[i];
        }
        // find min value in d
        double min = 500;
        for (int i = 0; i < 3; i++) {
            if (d[i] < min)
                min = d[i];
        }
        for (int i = 0; i < 3; i++) {
            double leftover = amount[i] - ratio[i] * min;
            System.out.println(leftover + " ");
        }
    }
}
