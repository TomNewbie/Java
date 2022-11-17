import java.util.*;
public class unbearablezoo {
     public static void show(ArrayList<String> mylist,HashMap<String,Integer>myAnimals) {
    	 for(String foo:mylist) {
 			System.out.println(foo+" | "+myAnimals.get(foo));
 		}
     }
     
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		HashMap<String,Integer> myAnimals=new HashMap<String,Integer>();
		ArrayList<String> mylist=new ArrayList<String>();
		int num=0,j;
		int num2=0,num3=0;
		while(true) {
			 num2=Integer.parseInt(read.nextLine());
			if(num2==0) {
				return;
			}
		for(j=0;j<num2;j=j+1) {
			String animal[]=read.nextLine().split(" ");
		   int length=animal.length;
			animal[length-1]=animal[length-1].toLowerCase();
			if(!myAnimals.containsKey(animal[length-1])) {
				myAnimals.put(animal[length-1],1);
				mylist.add(animal[length-1]);
			}else {
				num3 = myAnimals.get(animal[length-1]);
			myAnimals.replace(animal[length-1], num3+1);
		}
		}
		
		System.out.println("List " + ++num+":");
		Collections.sort(mylist);
		
		show(mylist,myAnimals);
		}}}


