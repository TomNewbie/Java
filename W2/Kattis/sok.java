package W2.Kattis;

import java.util.Scanner;

public class sok {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] amount = new int[3];
        double[] ratio = new double[3];
        double[] d = new double[3];
        for (int i = 0; i < 3; i++) {
            amount[i] = scan.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            ratio[i] = scan.nextDouble();
            d[i] = amount[i] / ratio[i];
        }
        // find min value in d
        double min = 500;
        for (int i = 0; i < 3; i++) {
            if (d[i] < min)
                min = d[i];
        }
        for (int i = 0; i < 3; i++) {
            double leftover = amount[i] - ratio[i] * min;
            System.out.println(leftover + " ");
        }
    }
}
