
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: 	Divisors
* Link: https://open.kattis.com/contests/uk27ry/problems/divisors
* @author Tho Phan Chi
* @version 1.0,2022-11-11
* 
* Status : Accepted
*/
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

public class divisors {
    static BitSet primesieve = new BitSet();
    static ArrayList<Integer> truePrime = new ArrayList<>();

    //
    static int numberFactor(int x, int k) {
        int count = 0;
        while (x > 0) {
            x /= k;
            count += x;
        }
        return count;
    }

    static void generatePrime() {
        primesieve.set(1, 500, true);
        for (int i = 2; i <= 500; i++) {
            if (primesieve.get(i)) {
                truePrime.add(i);
                for (int j = i * i; j <= 500; j += i) {
                    primesieve.set(j, false);
                }
            }
        }
    }

    static long findNumberDivisors(int x, int y) {
        long result = 1;
        for (int i = 0; truePrime.get(i) <= x; i++) {
            int prime = truePrime.get(i);
            long countNum = numberFactor(x, prime) - numberFactor(y, prime) - numberFactor(x - y, prime);
            result *= (countNum + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        generatePrime();
        while (scan.hasNext()) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(findNumberDivisors(x, y));
        }
    }
}
