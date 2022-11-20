import java.util.Scanner;
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Problem D Left Beehind
* Link: https://open.kattis.com/contests/uk27ry/problems/leftbeehind
* @author Ferid Gökkaya
* @version 1.0, 2022-11-06
* 
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.102
*/
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
