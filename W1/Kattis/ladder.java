import java.util.Scanner;
public class ladder {

	public static void(String[] args) {
		 double h;
         double v;
         
         Scanner scanner = new Scanner(System.in);
         String input=scanner.nextLine();
         Scanner scanner2 = new Scanner(input);
         h = scanner2.nextDouble();
         v = scanner2.nextDouble();
         System.out.println((int)(Math.ceil(h/(Math.sin(v*Math.PI/180)))));
	}}
