package Kattis;

import java.util.Scanner;

public class flyingsafely {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTest = scan.nextInt();
        for (int i = 0; i < numTest; i++) {
            int cities = scan.nextInt();
            int pilots = scan.nextInt();
            // System.out.println(pilots);
            for (int j = 0; j < pilots; j++) {
                int rac = scan.nextInt();
                int ruoi = scan.nextInt();
            }
            int minPilots = pilots < cities ? pilots : cities - 1;
            System.out.println(minPilots);
        }
        scan.close();
    }
}
