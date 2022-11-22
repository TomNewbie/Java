import java.util.*;
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Problem F Heliocentric
* Link: https://open.kattis.com/contests/uk27ry/problems/heliocentric
* @author Ferid Gökkaya
* @version 1.0, 2022-11-06
* 
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.102
*/
public class Heliocentic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
     int earth,mars;
     int casenumber=1;
while(s.hasNextInt()) {
	 earth = s.nextInt();
	 mars = s.nextInt();
	int i;
	for (i=0; earth != 0 || mars != 0; i++) {
		earth = (earth+1)%365;
		mars = (mars+1)%687;
	}
	System.out.printf("Case %d: %d%n", casenumber++, i);
}
    
	
	}
}
