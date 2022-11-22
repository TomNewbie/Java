
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Touchscreen Keyboard
* Link: https://open.kattis.com/contests/mjt68e/problems/touchscreenkeyboard
* @author Tho Phan Chi
* @version 1.0,2022-10-27
* 
* Method : Hash-map
* Run-time: 0.15
* Status : Accepted
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class TouchScreen {
    static String str1 = "qwertyuiop";
    static String str2 = "asdfghjkl";
    static String str3 = "zxcvbnm";

    public static int manhattanDis(char a, char b) {
        return Math.abs(Xval(a) - Xval(b)) + Math.abs(Yval(a) - Yval(b));
    }

    public static int Yval(char x) {

        if (str1.contains("" + x))
            return 1;

        if (str2.contains("" + x))
            return 2;

        return 3;
    }

    public static int Xval(char x) {

        if (str1.contains("" + x))
            return str1.indexOf(x);

        if (str2.contains("" + x))
            return str2.indexOf(x);

        return str3.indexOf(x);
    }

    public static int calculateDis(String a, String b) {
        int totalDis = 0;
        for (int i = 0; i < a.length(); i++) {
            totalDis += manhattanDis(a.charAt(i), b.charAt(i));
        }
        return totalDis;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            ArrayList<String> words = new ArrayList<>();

            HashMap<String, Integer> ans = new HashMap<>();
            String test = scan.next();
            int count2 = scan.nextInt();
            for (int j = 0; j < count2; j++) {
                String a = scan.next();
                int dis = calculateDis(a, test);
                words.add(a);
                ans.put(a, dis);
            }
            Collections.sort(words, new Comparator<String>() {
                public int compare(String a, String b) {
                    int num1 = ans.get(a);
                    int num2 = ans.get(b);

                    if (num1 == num2)
                        return a.compareTo(b);
                    else
                        return num1 - num2;
                }
            });
            for (int k = 0; k < words.size(); k++) {
                System.out.println(words.get(k) + " " + ans.get(words.get(k)));
            }
            ans.clear();
        }
        scan.close();

    }
}
