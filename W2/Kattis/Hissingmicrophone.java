import java.util.Scanner;

public class Hissingmicrophone {

	public static void main(String[] args) {
		boolean test=false;
		String whichword="ss";
	   Scanner read=new Scanner(System.in);
	   String word;
	   while(read.hasNextLine()) {
		    word=read.nextLine();
		   if(word.contains(whichword)) {
			   test=true;
			   break;
		   }
	   }
	   
	   if(test) {System.out.println("hiss");}
	   else
	   {
		   System.out.println("no hiss");}
	  

	}

}
