// package W3.Kattis

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class gcds {
    static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGCD(b, b % a);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLoop = scan.nextInt();
        Set<Integer> number = new HashSet<>();
        for (int i = 0; i < numLoop; i++) {
            number.add(scan.nextInt());
        }
        Iterator<Integer> it = number.iterator();
        ArrayList<Integer> arr = new ArrayList<>();
        int count = 0;
        while (it.hasNext()) {
            arr.add(count, it.next());
            count++;
        }
        for (int i = 0; i < numLoop - 1; i++) {
            number.add(getGCD(arr.get(i), arr.get(i + 1)));
            for (int j = i + 2; j < numLoop; j++) {
                number.add(getGCD(arr.get(i), arr.get(j)));
            }
        }
        Iterator<Integer> it2 = number.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        // System.out.println(number.size());
    }
}
