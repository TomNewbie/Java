
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: 	Server
* Link: https://open.kattis.com/contests/ggi5da/problems/server
* @author Tho Phan Chi
* @version 1.0,2022-10-31
* 
* Status : Accepted
*/
import java.util.Scanner;

public class server {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int task = scan.nextInt();
        int totalTime = scan.nextInt();
        int count = 0;
        int sum = 0;
        int[] taskArray = new int[50];
        for (int i = 0; i < task; i++) {
            taskArray[i] = scan.nextInt();
        }
        while (count < task && sum + taskArray[count] <= totalTime) {
            sum += taskArray[count];
            count++;
        }
        System.out.println(count);
        scan.close();
    }

}
