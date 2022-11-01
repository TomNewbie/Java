package W2.Kattis;

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
