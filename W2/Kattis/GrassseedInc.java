import java.util.Scanner;
public class GrassseedInc {

	public static void main(String[] args) {
	   
		 Scanner read = new Scanner(System.in);
	        double num1 = Double.parseDouble(read.nextLine());
	        int lawn = Integer.parseInt(read.nextLine());
	        double numbers= 0;
	        for(int i = 0; i < lawn; i++){
	            String[] num = read.nextLine().split(" ");
	            numbers += (num1 * (Double.parseDouble(num[0]) * Double.parseDouble(num[1])));
	        }
	        System.out.println(numbers);
	}

}
