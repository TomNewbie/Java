import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2022
 * Problem: Problem F Hissing Microphone
 * Link: https://open.kattis.com/contests/ggi5da/problems/hissingmicrophone
 * 
 * @author Ferid Gökkaya
 * @version 1.0, 2022-10-30
 * 
 *          Method : Ad-Hoc
 *          Status : Accepted
 *          Runtime: 0.102
 */
public class Hissingmicrophone {

	public static void main(String[] args) {
		boolean test = false;
		String whichword = "ss";
		Scanner read = new Scanner(System.in);
		String word;
		while (read.hasNextLine()) {
			word = read.nextLine();
			if (word.contains(whichword)) {
				test = true;
				break;
			}
		}

		if (test) {
			System.out.println("hiss");
		} else {
			System.out.println("no hiss");
		}

	}

}
