
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Mancala
* Link: https://open.kattis.com/contests/ggi5da/problems/mancala
* @author Tho Phan Chi
* @version 1.0,2022-10-31
* 
* Status : Accepted
*/
import java.util.Scanner;

public class mancala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for (int i = 0; i < testCase; i++) {

            int problemNum = scan.nextInt();
            int counterNum = scan.nextInt();

            int pointer = 0;
            int[] counterPos = new int[2000];
            for (int x = 0; x < 2000; x++) {
                counterPos[x] = 0;
            }
            for (int j = 1; j <= counterNum; j++) {

                pointer = 0;
                while (counterPos[pointer] != 0) {
                    pointer++;
                }
                counterPos[pointer] = pointer + 1;
                for (int k = 0; k < pointer; k++) {
                    counterPos[k] = counterPos[k] - 1;
                }
            }
            int lastIndex = 1999;
            while (counterPos[lastIndex] == 0)
                lastIndex--;
            System.out.println(problemNum + " " + (lastIndex + 1));
            for (int h = 0; h <= lastIndex; h++) {
                System.out.print(counterPos[h] + " ");
                if (h % 10 == 9)
                    System.out.println();
            }
            System.out.println();
        }
        scan.close();
    }
}
