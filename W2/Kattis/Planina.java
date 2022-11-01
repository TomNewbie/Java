package W2.Kattis;

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
