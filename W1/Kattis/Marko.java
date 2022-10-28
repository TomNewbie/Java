package Kattis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Marko {
    public static void main(String[] args) {
        HashMap<Character, Character> T9_input = new HashMap<>();
        // Store value a...z in T9_input as 2..9
        T9_input.put('a', '2');
        T9_input.put('b', '2');
        T9_input.put('c', '2');
        T9_input.put('d', '3');
        T9_input.put('e', '3');
        T9_input.put('f', '3');
        T9_input.put('g', '4');
        T9_input.put('h', '4');
        T9_input.put('i', '4');
        T9_input.put('j', '5');
        T9_input.put('k', '5');
        T9_input.put('l', '5');
        T9_input.put('m', '6');
        T9_input.put('n', '6');
        T9_input.put('o', '6');
        T9_input.put('p', '7');
        T9_input.put('q', '7');
        T9_input.put('r', '7');
        T9_input.put('s', '7');
        T9_input.put('t', '8');
        T9_input.put('u', '8');
        T9_input.put('v', '8');
        T9_input.put('w', '9');
        T9_input.put('z', '9');
        T9_input.put('y', '9');
        T9_input.put('x', '9');
        Scanner scan = new Scanner(System.in);
        int wordNumber = scan.nextInt();
        ArrayList<String> wordArray = new ArrayList<>();
        for (int i = 0; i < wordNumber; i++) {
            // add word in to wordArray
            wordArray.add(scan.next());
        }
        String inputNumber = scan.next();
        scan.close();
        int count = 0;

        for (int i = 0; i < wordNumber; i++) {
            boolean equal = true;
            if (wordArray.get(i).length() != inputNumber.length())
                continue;
            // Check if inputNumber is resemble to the word in wordArray
            for (int j = 0; j < inputNumber.length(); j++) {
                // if it is not equal set equal to false so that count can not increment
                if (T9_input.get(wordArray.get(i).charAt(j)) != inputNumber.charAt(j)) {
                    equal = false;
                    break;
                }
            }
            // if equal is true count will increment
            if (equal)
                count++;
        }
        System.out.println(count);
    }
}
