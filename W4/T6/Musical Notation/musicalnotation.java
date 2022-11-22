
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Musical Notation

* Link: https://open.kattis.com/contests/tbnznz/problems/musicalnotation
* @author Tho Phan Chi
* @version 1.0,2022-11-19
* 
* Status : Accepted
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class musicalnotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.nextLine();
        String input = scan.nextLine();
        String[] arr = input.split(" ");
        String splash = String.format("%0" + 1000 + "d", 0).replace("0", "-");
        String nothing = String.format("%0" + 1000 + "d", 0).replace("0", " ");
        HashMap<Character, StringBuilder> result = new HashMap<>();
        result.put('F', new StringBuilder(splash));
        result.put('D', new StringBuilder(splash));
        result.put('B', new StringBuilder(splash));
        result.put('g', new StringBuilder(splash));
        result.put('e', new StringBuilder(splash));
        result.put('a', new StringBuilder(splash));
        result.put('G', new StringBuilder(nothing));
        result.put('E', new StringBuilder(nothing));
        result.put('C', new StringBuilder(nothing));
        result.put('A', new StringBuilder(nothing));
        result.put('f', new StringBuilder(nothing));
        result.put('d', new StringBuilder(nothing));
        result.put('c', new StringBuilder(nothing));
        result.put('b', new StringBuilder(nothing));
        Character[] seq = { 'G', 'F', 'E', 'D', 'C', 'B', 'A', 'g', 'f', 'e', 'd', 'c', 'b', 'a' };
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 1) {
                result.get(arr[i].charAt(0)).setCharAt(index, '*');
                index = index + 2;
            } else {
                int size = arr[i].charAt(1) - '0';
                for (int j = 0; j < size; j++) {
                    result.get(arr[i].charAt(0)).setCharAt(index, '*');
                    index++;
                }
                index = index + 1;
            }
        }
        for (int i = 0; i < seq.length; i++) {
            System.out.println(seq[i] + ": " + result.get(seq[i]).substring(0, index - 1));
        }
    }
}
