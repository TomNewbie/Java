
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Racing Around the Alphabet

* Link: https://open.kattis.com/contests/tbnznz/problems/racingalphabet
* @author Tho Phan Chi
* @version 1.0,2022-11-20
* 
* Status : Accepted
*/
import java.util.HashMap;
import java.util.Scanner;

public class racingalphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        scan.nextLine();
        HashMap<Character, Integer> hashhash = new HashMap<>();
        hashhash.put('A', 1);
        hashhash.put('B', 2);
        hashhash.put('C', 3);
        hashhash.put('D', 4);
        hashhash.put('E', 5);
        hashhash.put('F', 6);
        hashhash.put('G', 7);
        hashhash.put('H', 8);
        hashhash.put('I', 9);
        hashhash.put('J', 10);
        hashhash.put('K', 11);
        hashhash.put('L', 12);
        hashhash.put('M', 13);
        hashhash.put('N', 14);
        hashhash.put('O', 15);
        hashhash.put('P', 16);
        hashhash.put('Q', 17);
        hashhash.put('R', 18);
        hashhash.put('S', 19);
        hashhash.put('T', 20);
        hashhash.put('U', 21);
        hashhash.put('V', 22);
        hashhash.put('W', 23);
        hashhash.put('X', 24);
        hashhash.put('Y', 25);
        hashhash.put('Z', 26);
        hashhash.put(' ', 27);
        hashhash.put('\'', 28);
        for (int i = 0; i < testCase; i++) {
            String input = scan.nextLine();
            double result = input.length();
            double size = 0;
            for (int j = 1; j < input.length(); j++) {
                int distance = Math.abs(hashhash.get(input.charAt(j - 1)) - hashhash.get(input.charAt(j)));
                int minDistance = distance > 14 ? 28 - distance : distance;
                size += minDistance;
            }
            double circumference = size * 60 * Math.PI / 28;
            result = result + circumference / 15;
            System.out.println(result);
        }

    }
}
