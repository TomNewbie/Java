
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Take Two Stones
* Link: https://open.kattis.com/contests/ggi5da/problems/twostones
* @author Trần Hoàng Kim
* @version 1.0, 2022-10-31 
* 
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10s
*/

import java.util.Scanner;

public class TakeTwoStones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		if (N >= 1 && N <= 10000000) {
			N = N % 2;

			if (N != 0) {
				System.out.println("Alice");
			} else {
				System.out.println("Bob");
			}
		}
	}
}
