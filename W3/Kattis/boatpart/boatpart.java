import java.util.*;


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
