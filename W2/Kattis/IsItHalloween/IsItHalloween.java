/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: IsItHalloween.com
* Link: https://open.kattis.com/contests/ggi5da/problems/isithalloween
* @author Trần Hoàng Kim
* @version 1.0, 2022-11-01 
* 
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.10s
*/

import java.util.Scanner;

public class IsItHalloween {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		int day = sc.nextInt();
		
		if((month.equals("OCT") && day == 31) || (month.equals("DEC") && day == 25)) {
			System.out.println("yup");
		} else {
			System.out.println("nope");
		}
	}
}
