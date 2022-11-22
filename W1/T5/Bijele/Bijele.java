/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Bijele
* Link: https://open.kattis.com/contests/mjt68e/problems/bijele
* @author Ferid Gökkaya 
* @version 1.0,2022-10-21
* 
* Method : Ad-Hoc
* Status : Accepted
*/

import java.util.Scanner;

public class Bijele {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pieces[] = { 1, 1, 2, 2, 2, 8 };
		int arr[] = new int[6];
		int i;
		int sum = 0;
		for (i = 0; i < 6; i++) {
			arr[i] = sc.nextInt();
			sum = pieces[i] - arr[i];
			System.out.print(sum + " ");
			sum = 0;
		}
	}

}
