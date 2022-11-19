import java.util.Scanner;

public class Pizzacrust {

	public static void main(String[] args) {
		Scanner enter=new Scanner(System.in);
        
        double radius= enter.nextDouble();
        
        double crust= enter.nextDouble();
        double num =Math.pow(radius-crust,2);
        System.out.println(num/(radius*radius)*100);
	}

}
