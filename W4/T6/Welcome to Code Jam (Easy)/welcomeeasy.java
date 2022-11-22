package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

// package W4;

public class welcomeeasy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        scan.nextLine();
        String test = new String("welcome to code jam");
        for (int i = 0; i < testCase; i++) {
            String s = scan.nextLine();
            int[][] count = new int[500][19];
            if (test.charAt(0) == s.charAt(0)) {
                count[0][0]++;
            }
            for (int index = 1; index < s.length(); index++) {
                count[index][0] = count[index - 1][0];
                if (test.charAt(0) == s.charAt(index)) {
                    count[index][0] = count[index - 1][0] + 1;
                }
                // System.out.println("Count[" + index + "][0]" + "= " + count[index - 1][0]);

            }
            for (int a = 1; a < s.length(); a++) {
                for (int t = 1; t < test.length(); t++) {
                    if (s.charAt(a) == test.charAt(t)) {
                        count[a][t] = count[a - 1][t - 1] + count[a - 1][t];
                    } else {
                        count[a][t] = count[a - 1][t];
                    }
                    // System.out.println("Count[" + a + "][" + t + "]" + "= " + count[a][t]);
                }
            }
            String result = String.format("%04d", count[s.length() - 1][18]);
            int num = i + 1;
            System.out.println("Case #" + num + ": " + result);
        }
    }
}
