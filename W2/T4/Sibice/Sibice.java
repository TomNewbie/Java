
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Sibice
* Link: https://open.kattis.com/contests/ggi5da/problems/sibice
* @author Trần Hoàng Kim 
* @version 1.0, 2022-11-01
*
* Method : Math
* Status : Accepted
* Runtime: 0.10s 
*/

import java.util.Scanner;
import java.lang.Math;

public class Sibice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int W = sc.nextInt();
		int H = sc.nextInt();

		// maxium length for a match lying
		double length = Math.sqrt(H * H + W * W);

		for (int i = 0; i < N; i++) {
			if (length >= sc.nextInt()) {
				System.out.println("DA");
			} else {
				System.out.println("NE");
			}
		}
	}
}
