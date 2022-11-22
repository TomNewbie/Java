
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: 	Password Hacking

* Link: https://open.kattis.com/contests/tbnznz/problems/password
* @author Tho Phan Chi
* @version 1.0,2022-11-20
* 
* Status : Accepted
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        ArrayList<Float> probability = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            String password = scan.next();
            probability.add(scan.nextFloat());
        }
        Collections.sort(probability);
        int count = probability.size();
        float result = 0;
        for (float probs : probability) {
            result = result + count * probs;
            count--;
        }
        System.out.println(result);
        scan.close();
    }
}
