package Kattis;

import java.util.Scanner;
import java.lang.Math;

public class yoda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.next();
        String num2 = scan.next();
        String a_num1 = "";
        String a_num2 = "";
        int len1 = num1.length();
        int len2 = num2.length();
        if (num1.length() > num2.length()) {
            for (int i = 0; i < len1 - len2; i++) {
                num2 = "0" + num2;
            }
        } else {
            for (int i = 0; i < len2 - len1; i++) {
                num1 = "0" + num1;
            }
        }
        int length = Math.max(len1, len2);
        for (int i = 0; i < length; i++) {
            if ((num1.charAt(i) - '0') > (num2.charAt(i) - '0')) {
                a_num1 += num1.charAt(i);
            } else if ((num1.charAt(i) - '0') == (num2.charAt(i) - '0')) {
                a_num2 += num2.charAt(i);
                a_num1 += num1.charAt(i);
            } else {
                a_num2 += num2.charAt(i);
            }
        }
        if (a_num1 == "") {
            System.out.println("YODA");
        } else
            System.out.println(Integer.parseInt(a_num1));
        if (a_num2 == "") {
            System.out.println("YODA");
        } else
            System.out.println(Integer.parseInt(a_num2));
        scan.close();
    }
}
