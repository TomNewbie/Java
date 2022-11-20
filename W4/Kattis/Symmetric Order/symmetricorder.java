// package Kattis.Symmetric

import java.util.Scanner;

public class symmetricorder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int index = 1;
        while (x != 0) {
            scan.nextLine();
            String[] origin = new String[x];
            int end = x - 1;
            int start = 0;
            for (int i = 0; i < x; i++) {
                if (i % 2 == 0) {
                    origin[start] = scan.nextLine();
                    start++;
                } else {
                    origin[end] = scan.nextLine();
                    end--;
                }
            }
            System.out.println("SET " + index);
            for (int i = 0; i < x; i++) {
                System.out.println(origin[i]);
            }
            index++;
            x = scan.nextInt();
        }
    }
}
