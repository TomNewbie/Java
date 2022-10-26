package Kattis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Marko {
    public static void main(String[] args) {
        HashMap<Character, Character> input = new HashMap<>();
        input.put('a', '2');
        input.put('b', '2');
        input.put('c', '2');
        input.put('d', '3');
        input.put('e', '3');
        input.put('f', '3');
        input.put('g', '4');
        input.put('h', '4');
        input.put('i', '4');
        input.put('j', '5');
        input.put('k', '5');
        input.put('l', '5');
        input.put('m', '6');
        input.put('n', '6');
        input.put('o', '6');
        input.put('p', '7');
        input.put('q', '7');
        input.put('r', '7');
        input.put('s', '7');
        input.put('t', '8');
        input.put('u', '8');
        input.put('v', '8');
        input.put('w', '9');
        input.put('z', '9');
        input.put('y', '9');
        input.put('x', '9');
        Scanner scan = new Scanner(System.in);
        int wordNumber = scan.nextInt();
        ArrayList<String> wordArray = new ArrayList<>();
        for (int i = 0; i < wordNumber; i++) {
            wordArray.add(scan.next());
        }
        String S = scan.next();
        scan.close();
        int count = 0;
        for (int i = 0; i < wordNumber; i++) {
            boolean equal = true;
            if (wordArray.get(i).length() != S.length())
                continue;
            for (int j = 0; j < S.length(); j++) {
                if (input.get(wordArray.get(i).charAt(j)) != S.charAt(j)) {
                    equal = false;
                    break;
                }
            }
            if (equal)
                count++;
        }
        System.out.println(count);
    }
}
