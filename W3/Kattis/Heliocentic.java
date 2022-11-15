import java.util.*;
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
