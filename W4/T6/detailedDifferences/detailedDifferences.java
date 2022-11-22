
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Detailed Differences
* Link: https://open.kattis.com/contests/tbnznz/problems/detaileddifferences
* @author Trần Hoàng Kim 
* @version 1.0, 2022-11-18
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.18s 
*/

import java.util.Scanner;

public class detailedDifferences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCasesNumber = sc.nextInt();
        for (int i = 0; i < testCasesNumber; i++) {
            String string1 = sc.next();
            String string2 = sc.next();
            char[] charList = new char[string1.length()];
            for (int j = 0; j < string1.length(); j++) {
                if (string1.charAt(j) == string2.charAt(j)) {
                    charList[j] = '.';
                } else {
                    charList[j] = '*';
                }
            }
            String result = String.valueOf(charList);
            System.out.println(string1);
            System.out.println(string2);
            System.out.println(result);
            System.out.println();
        }
        sc.close();
    }
}
