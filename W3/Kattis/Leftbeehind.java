import java.util.Scanner;
public class Leftbeehind {
     public static void main(String[] args) {
	 Scanner read=new Scanner(System.in);
		while(true) {
			int x=read.nextInt();
			int y=read.nextInt();
			if(x==0&&y==0) 
				break;
			if((x+y)== 13) 
			System.out.println("Never speak again.");
			else if(x==y) 
				System.out.println("Undecided.");
		else if(x>y) 
		        System.out.println("To the convention.");
				
			else
					
			System.out.println("Left beehind.");
		}
     }}


