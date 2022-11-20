import java.util.ArrayList;
import java.util.Scanner;
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Problem J Quick Estimates
* Link: https://open.kattis.com/contests/ggi5da/problems/quickestimate
* @author Ferid Gökkaya
* @version 1.0, 2022-10-30
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.102
*/
public class Quickestimates {

	public static void main(String[] args) {
		Scanner enter=new Scanner(System.in);
		int n=Integer.parseInt(enter.nextLine());
		int j;
		int mod=0;
		ArrayList<String> al=new ArrayList<String>();
		for(j=0;j<n;j++) {
			String s= enter.nextLine();
			al.add(s);
		    
		}
		for(j=0;j<n;j++) {
		System.out.println(al.get(j).length());}
	}

}
