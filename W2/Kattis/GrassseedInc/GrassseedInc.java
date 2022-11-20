import java.util.Scanner;
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Problem Grass Seed Inc.
* Link: https://open.kattis.com/contests/ggi5da/problems/grassseed
* @author Ferid Gökkaya
* @version 1.0, 2022-10-30 
* 
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.102
*/	
public class GrassseedInc {

	public static void main(String[] args) {
	   
		 Scanner read = new Scanner(System.in);
	        double num1 = Double.parseDouble(read.nextLine());
	        int lawn = Integer.parseInt(read.nextLine());
	        double numbers= 0;
	        for(int i = 0; i < lawn; i++){
	            String[] num = read.nextLine().split(" ");
	            numbers += (num1 * (Double.parseDouble(num[0]) * Double.parseDouble(num[1])));
	        }
	        System.out.println(numbers);
	}

}
