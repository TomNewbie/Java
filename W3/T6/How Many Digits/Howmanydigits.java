import java.util.*;
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Problem O How Many Digits?
* Link: https://open.kattis.com/contests/uk27ry/problems/howmanydigits
* @author Ferid Gökkaya
* @version 1.0,	2022-11-06 
* 
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.102
*/
public class Howmanydigits {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		while (read.hasNextInt())
			{
			int mynumber = read.nextInt();
			double number1=Math.log10(Math.sqrt(2 * mynumber * Math.PI));
			double number2=mynumber*Math.log10(mynumber / Math.E);
			System.out.println((int)(number1 + number2) + 1);
			}
	}

}
