package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class ScalingRecipe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTestCase = scan.nextInt();
        int numProduce = scan.nextInt();
        int numRequire = scan.nextInt();
        ArrayList<Integer> arrayNumProduce = new ArrayList<>();
        for (int i = 0; i < numTestCase; i++) {
            arrayNumProduce.add(scan.nextInt());
        }
        scan.close();
        for (int i = 0; i < numTestCase; i++) {
            System.out.println(numRequire * arrayNumProduce.get(i) / numProduce);
        }
    }
}
