package Kattis;

import java.util.HashMap;
import java.util.Scanner;

public class falsesecurity {
    public static void main(String[] args) {
        // Create a HashMap object called decode
        HashMap<String, Character> decode = new HashMap<>();
        
        // Add keys and value (Morse code, Letter)
        decode.put(".-", 'A');
        decode.put("-...", 'B');
        decode.put("-.-.", 'C');
        decode.put("-..", 'D');
        decode.put(".", 'E');
        decode.put("..-.", 'F');
        decode.put("--.", 'G');
        decode.put("....", 'H');
        decode.put("..", 'I');
        decode.put(".---", 'J');
        decode.put("-.-", 'K');
        decode.put(".-..", 'L');
        decode.put("--", 'M');
        decode.put("-.", 'N');
        decode.put("---", 'O');
        decode.put(".--.", 'P');
        decode.put("--.-", 'Q');
        decode.put(".-.", 'R');
        decode.put("...", 'S');
        decode.put("-", 'T');
        decode.put("..-", 'U');
        decode.put("...-", 'V');
        decode.put(".--", 'W');
        decode.put("-..-", 'X');
        decode.put("-.--", 'Y');
        decode.put("--..", 'Z');
        decode.put("..--", '_');
        decode.put(".-.-", ',');
        decode.put("---.", '.');
        decode.put("----", '?');
        
        // Create a HashMap object called encode
        HashMap<Character, String> encode = new HashMap<>();

        // Add value and keys (Letter, Morse code)
        encode.put('A', ".-");
        encode.put('B', "-...");
        encode.put('C', "-.-.");
        encode.put('D', "-..");
        encode.put('E', ".");
        encode.put('F', "..-.");
        encode.put('G', "--.");
        encode.put('H', "....");
        encode.put('I', "..");
        encode.put('J', ".---");
        encode.put('K', "-.-");
        encode.put('L', ".-..");
        encode.put('M', "--");
        encode.put('N', "-.");
        encode.put('O', "---");
        encode.put('P', ".--.");
        encode.put('Q', "--.-");
        encode.put('R', ".-.");
        encode.put('S', "...");
        encode.put('T', "-");
        encode.put('U', "..-");
        encode.put('V', "...-");
        encode.put('W', ".--");
        encode.put('X', "-..-");
        encode.put('Y', "-.--");
        encode.put('Z', "--..");
        encode.put('_', "..--");
        encode.put(',', ".-.-");
        encode.put('.', "---.");
        encode.put('?', "----");
        
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String a = scan.next();
            String b = "";
            String number = "";
            String result = "";
            // First we Convert the text to Morse code without pauses but with a string of
            // numbers to indicate code lengths.
            for (int i = 0; i < a.length(); i++) {
                b += encode.get(a.charAt(i));
                number += encode.get(a.charAt(i)).length();
            }
            
            // Reverse the string of numbers.
            String reverse = new StringBuilder(number).reverse().toString();
            int index = 0;
            
            // Convert the dots and dashes back into the text using the reversed string of
            // numbers as code lengths.

            for (int i = 0; i < a.length(); i++) {
                int num = reverse.charAt(i) - '0';
                result += decode.get(b.substring(index, num + index));
                index += num;
            }
            System.out.println(result);
        }
        scan.close();
    }
}
