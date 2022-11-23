
import java.util.Scanner;

public class cold {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int zahl;
		int t = 0;
		for (int i = 0; i < n; i++) {
			zahl = scanner.nextInt();
			if (zahl < 0) {
				t++;
			}
		}
		System.out.println(t);

	}

}
