
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Alphabet Spam
* Link: https://open.kattis.com/contests/tbnznz/problems/alphabetspam
* @author Trần Hoàng Kim 
* @version 1.0, 2022-11-16 
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.16s 
*/

import java.util.Scanner;

public class alphabetSpam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sample = sc.next();
        double lowerCaseLettersCount = 0.0;
        double upperCaseLettersCount = 0.0;
        double symbolsCount = 0.0;
        double spaceCount = 0.0;
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) >= 'a' && sample.charAt(i) <= 'z') {
                lowerCaseLettersCount++;
            } else if (sample.charAt(i) >= 'A' && sample.charAt(i) <= 'Z') {
                upperCaseLettersCount++;
            } else if (sample.charAt(i) == ('_')) {
                spaceCount++;
            } else {
                symbolsCount++;
            }
        }

        sc.close();

        System.out.println(spaceCount / sample.length());
        System.out.println(lowerCaseLettersCount / sample.length());
        System.out.println(upperCaseLettersCount / sample.length());
        System.out.println(symbolsCount / sample.length());

    }
}
