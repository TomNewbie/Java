
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: 	Honeycomb Walk

* Link: https://open.kattis.com/contests/tbnznz/problems/honey
* @author Tho Phan Chi
* @version 1.0,2022-11-19
* 
* Status : Accepted
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// // package W4;

public class honey {
    public static int[][][] matrix = new int[30][30][30];

    public static void runIHateRecursion(int length) {
        for (int i = 1; i <= length; i++) {
            matrix[14][14][i] = iHateRecursion(14, 14, i);
        }
    }

    // I hate it because It took me 2 hours to realize that recursion is more better
    public static int iHateRecursion(int xCoor, int yCoor, int i) {
        if (i == 0 || matrix[xCoor][yCoor][i] != 0) {
            return matrix[xCoor][yCoor][i];
        } else {

            int result = 0;

            // double step = i - 1;
            matrix[xCoor + 1][yCoor + 1][i - 1] = iHateRecursion(xCoor + 1,
                    yCoor + 1,
                    i - 1);
            matrix[xCoor + 1][yCoor][i - 1] = iHateRecursion(xCoor + 1,
                    yCoor,
                    i - 1);
            matrix[xCoor][yCoor + 1][i - 1] = iHateRecursion(xCoor,
                    yCoor + 1,
                    i - 1);
            matrix[xCoor - 1][yCoor][i - 1] = iHateRecursion(xCoor - 1,
                    yCoor,
                    i - 1);
            matrix[xCoor - 1][yCoor - 1][i - 1] = iHateRecursion(xCoor - 1,
                    yCoor - 1,
                    i - 1);
            matrix[xCoor][yCoor - 1][i - 1] = iHateRecursion(xCoor,
                    yCoor - 1,
                    i - 1);
            result += matrix[xCoor + 1][yCoor + 1][i - 1] + matrix[xCoor + 1][yCoor][i - 1]
                    + matrix[xCoor][yCoor + 1][i - 1] + matrix[xCoor - 1][yCoor][i - 1]
                    + matrix[xCoor - 1][yCoor - 1][i - 1] + matrix[xCoor][yCoor - 1][i - 1];
            return result;

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double testCase = scan.nextInt();
        ArrayList<Integer> thanh = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            thanh.add(scan.nextInt());
        }
        int max = Collections.max(thanh);
        matrix[14][14][0] = 1;
        runIHateRecursion(max);

        for (int i : thanh) {
            System.out.println(matrix[14][14][i]);
        }
    }
}
