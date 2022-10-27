package Kattis;

import java.util.HashMap;

public class falsesecurity {
    public static void main(String[] args) {
        HashMap<String, Character> decode = new HashMap<>();
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
        decode.put("...-", 'V');
        decode.put(".--", 'W');
        decode.put("-..-", 'X');
        decode.put("-.--", 'Y');
        decode.put("--..", 'Z');
        decode.put("..--", '_');
        decode.put(".-.-", ',');
        decode.put("---.", '.');
        decode.put("----", '?');
        HashMap<Character, String> encode = new HashMap<>();

        encode.put('A', ".-");
        encode.put('B', "-...");
        encode.put('C', "-.-.");
        encode.put('D', "-..");
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
        encode.put('V', "...-");
        encode.put('W', ".--");
        encode.put('X', "-..-");
        encode.put('Y', "-.--");
        encode.put('Z', "--..");
        encode.put('_', "..--");
        encode.put(',', ".-.-");
        encode.put('.', "---.");
        encode.put('?', "----");

    }
}
