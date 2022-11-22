// package W3.Kattis;

import java.util.BitSet;
import java.util.Scanner;

public class primesieve {
    static BitSet arrPrime;

    static int checkPrime(int key) {
        return arrPrime.get(key - 1) == true ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int checkNum = scan.nextInt();
        int numPrime = checkNum - 1;
        arrPrime = new BitSet();
        arrPrime.set(1, checkNum, true);
        // Create Bit Set of Prime indicate that true valuue is Prime, false otherwise
        for (int i = 2; i <= Math.sqrt(checkNum); i++) {
            if (arrPrime.get(i - 1)) {
                for (int j = i * i; j <= checkNum; j += i) {
                    if (arrPrime.get(j - 1)) {
                        numPrime--;
                    }
                    arrPrime.set(j - 1, false);
                }
            }
        }
        System.out.println(numPrime);
        int testLoop = scan.nextInt();
        for (int i = 0; i < testLoop; i++) {
            System.out.println(checkPrime(scan.nextInt()));
        }
    }
}
