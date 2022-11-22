
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: 	Smallest Multiple
* Link: https://open.kattis.com/contests/uk27ry/problems/smallestmultiple
* @author Tho Phan Chi
* @version 1.0,2022-11-11
* 
* Status : Accepted
*/
import java.math.BigInteger;
import java.util.Scanner;

public class smallestmultiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String number = scan.nextLine();
            String[] arrayNum = number.split(" ");
            int[] num = new int[arrayNum.length];
            int index = 0;
            // convert string arr to number arr
            BigInteger lcm = BigInteger.ONE;
            for (String x : arrayNum) {
                num[index] = Integer.parseInt(x);
                index++;
            }
            // Formula for LCM(a,b) = a * b /GCD(a,b)
            for (int x : num) {
                lcm = lcm.multiply(BigInteger.valueOf(x)).divide(lcm.gcd(BigInteger.valueOf(x)));
            }
            System.out.println(lcm);
        }
    }
}
