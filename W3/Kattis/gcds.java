// package W3.Kattis

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class gcds {
    static ArrayList<Integer> arrayGcd = new ArrayList<>();

    static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGCD(b, a % b);
        }
    }

    // this function will use 2 consecutive number -> find it gcd store in array so
    // that after a loop
    static void reduceArray() {
        ArrayList<Integer> newArray = new ArrayList<>();
        for (int i = 0; i < arrayGcd.size() - 1; i++) {
            // System.out.println(getGCD(arrayGcd.get(i), arrayGcd.get(i + 1)));
            newArray.add(getGCD(arrayGcd.get(i), arrayGcd.get(i + 1)));
        }
        // System.out.println("----------------");
        arrayGcd = newArray;
    }

    static void merge() {
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(arrayGcd.get(0));
        for (int i = 1; i < arrayGcd.size(); i++) {
            if (arrayGcd.get(i) != temp.get(temp.size() - 1)) {
                temp.add(arrayGcd.get(i));
            }
        }
        arrayGcd = temp;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numLoop = scan.nextInt();
        Set<Integer> solution = new HashSet<>();
        for (int i = 0; i < numLoop; i++) {
            arrayGcd.add(scan.nextInt());
        }

        // for (int i = 0; i < numLoop - 1; i++) {
        // int first = getGCD(arr.get(i), arr.get(i + 1));
        // number.add(first);
        // for (int j = i + 2; j < numLoop; j++) {
        // first = getGCD(first, arr.get(j));
        // number.add(first);
        // }
        // }
        for (int i = 0; i < arrayGcd.size(); i++) {
            solution.add(arrayGcd.get(i));
        }
        while (arrayGcd.size() > 1) {
            merge();
            reduceArray();
            for (int i = 0; i < arrayGcd.size(); i++) {
                solution.add(arrayGcd.get(i));
            }
        }
        for (int i : arrayGcd) {
            solution.add(i);
        }

        System.out.println(solution.size());
    }
}
