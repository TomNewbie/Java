/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Nasty Hacks
* Link: https://open.kattis.com/contests/ggi5da/problems/nastyhacks
* @author Trần Hoàng Kim 
* @version 1.0, 2022-10-31
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.12s 
*/

import java.util.Scanner;

public class NastyHacks {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int r = sc.nextInt();
			int e = sc.nextInt();
			int c = sc.nextInt();
			
			if(e - c > r) {
				System.out.println("advertise");
			} else if (e - c < r) {
				System.out.println("do not advertise");
			} else {
				System.out.println("does not matter");
			}
		}		
	}
}
