/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Planina
* Link: https://open.kattis.com/contests/ggi5da/problems/planina
* @author Trần Hoàng Kim 
* @version 1.0, 2022-11-01
*
* Method : Math 
* Status : Accepted
* Runtime: 0.10s 
*/


import java.util.Scanner;
import java.lang.*;

public class Planina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int e = (int)Math.pow(2, N) + 1;
		System.out.println(e*e);
	}
}
