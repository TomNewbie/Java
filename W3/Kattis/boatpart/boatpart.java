import java.util.*;

/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Problem A Boat Parts
* Link: https://open.kattis.com/contests/uk27ry/problems/boatparts
* @author Ferid Gökkaya
* @version 1.0,	2022-11-06
* 
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.102
*/
public class boatpart {

	public static void main(String[] args) {
		int i=0;
		  Scanner enteringvalues = new Scanner(System.in);
		  String[] line = enteringvalues.nextLine().split(" ");
		    int parts = Integer.parseInt(line[0]);
		    int days = Integer.parseInt(line[1]);
		    HashSet<String> mylist = new HashSet<>();
		    do{
		      String currentline = enteringvalues.nextLine();
		      mylist.add(currentline);
		      if (mylist.size() == parts) {
		        System.out.println(i + 1);
		        break;
		      }
		      if(i== days-1){
		        System.out.println("paradox avoided");
		      }
		      i++;
		    }while(i<days);

	}

}
