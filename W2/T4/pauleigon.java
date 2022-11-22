package W2.Kattis;

import java.util.Scanner;

public class pauleigon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int P = scan.nextInt();
        int Q = scan.nextInt();
        int result = (P + Q) / N % 2;
        if (result == 0) {
            System.out.println("paul");
        } else {
            System.out.println("opponent");
        }
        scan.close();
    }
}
