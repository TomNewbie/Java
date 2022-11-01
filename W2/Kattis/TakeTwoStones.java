package W2.Kattis;

import java.util.Scanner;

public class TakeTwoStones {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
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
