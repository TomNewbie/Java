import java.util.Scanner;

public class unlockPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrixPivot = new int[3][3];
        int [] pivot1 = new int[2];

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                matrixPivot[row][col] = sc.nextInt();
                if (matrixPivot[row][col] == 1) {
                    pivot1[0] = row;
                    pivot1[1] = col;
                }
            }
        }
        sc.close();

        double distance2Pivots = 0;
        for (int num = 1; num < 9; num++) {
            int[] pivot2 = new int[2];
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    if (matrixPivot[row][col] == num + 1) {
                        pivot2[0] = row;
                        pivot2[1] = col;
                    }
                }
            }
            double x2Pivots = Math.pow((pivot2[0] - pivot1[0]),2);
            double y2Pivots = Math.pow((pivot2[1] - pivot1[1]), 2);
            // distance 2 pivots = sqrt ((x1-x0) + (y1-y0))
            distance2Pivots += Math.sqrt(x2Pivots + y2Pivots);
            pivot1 = pivot2;
        }
        System.out.println(distance2Pivots);
    }
}
