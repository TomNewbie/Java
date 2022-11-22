
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Prime Sieve
* Link: https://open.kattis.com/contests/uk27ry/problems/primesieve
* @author Tho Phan Chi
* @version 1.0,2022-11-11
* 
* Status : Accepted
*/
import java.util.BitSet;
import java.util.Scanner;

public class primesieve {
    static BitSet arrPrime;

    static int checkPrime(int key) {
        return arrPrime.get(key - 1) == true ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int numPrime = n - 1;
        arrPrime = new BitSet();
        arrPrime.set(1, n, true);
        // Create Bit Set of Prime indicate that true valuue is Prime, false otherwise
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (arrPrime.get(i - 1)) {
                for (int j = i * i; j <= n; j += i) {
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
