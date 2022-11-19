import java.util.*;
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
