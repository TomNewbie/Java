package Kattis;

import java.util.Scanner;

public class bus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for (int i = 0; i < testCase; i++) {
            int people = scan.nextInt();
            System.out.println((int) Math.pow(2, people) - 1);
        }
    }
}
