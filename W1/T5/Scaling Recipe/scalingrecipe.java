
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Scaling Recipe
* Link: https://open.kattis.com/contests/mjt68e/problems/scalingrecipe
* @author Tho Phan Chi
* @version 1.0,2022-10-27
* 
* Method : Math
* Run-time: 0.15
* Status : Accepted
*/
import java.util.ArrayList;
import java.util.Scanner;

public class scalingrecipe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTestCase = scan.nextInt();
        int numProduce = scan.nextInt();
        int numRequire = scan.nextInt();
        ArrayList<Integer> arrayNumProduce = new ArrayList<>();
        for (int i = 0; i < numTestCase; i++) {
            arrayNumProduce.add(scan.nextInt());
        }
        scan.close();
        for (int i = 0; i < numTestCase; i++) {
            System.out.println(numRequire * arrayNumProduce.get(i) / numProduce);
        }
    }
}
