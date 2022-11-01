import java.util.Scanner;

public class Pizzacrust {

	public static void main(String[] args) {
		Scanner enter=new Scanner(System.in);
        
        double radius= enter.nextDouble();
        
        double c= enter.nextDouble();
        double num =Math.pow(radius-c,2);
        System.out.println(num/(radius*radius)*100);
	}

}
