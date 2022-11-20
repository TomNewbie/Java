import java.util.ArrayList;
import java.util.Scanner;
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
