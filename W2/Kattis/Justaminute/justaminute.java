package minute;

import java.util.Scanner;


public class justaminute {
	public static double calc(int sec,int min) {
		double a=(double) sec;
		double b= (double)min;
		double num=a/b;
		return num;
	}
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);


        int plot = numbers.nextInt();
        int minimum = 0;
        int seconds = 0;
        while (plot-- > 0) {
            minimum += numbers.nextInt() * 60;
            seconds += numbers.nextInt();
        }
 
        if(minimum >= seconds) {
            System.out.println("measurement error");}
        else {
     System.out.format("%.9f", calc(seconds,minimum));}
      
    }
}
