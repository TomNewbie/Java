import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MixLetter2 {
    public static void mixupletter(ArrayList<String> mylist, String str) {
        String result;
        StringBuilder mergeCharacter = new StringBuilder();
        for (String s : mylist) {
            String foo = s;
            ArrayList<Character> mylist2 = new ArrayList<Character>();
            // skip for period . and comma ,
            if (s.charAt(foo.length() - 1) == '.' || s.charAt(foo.length() - 1) == ',') {
                str = foo.substring(1, foo.length() - 2);
            } else {
                str = foo.substring(1, foo.length() - 1);
            }

            char[] w = str.toCharArray();
            // Create a list for shuffle charater
            for (char c : w) {
                mylist2.add(c);
            }
            Collections.shuffle(mylist2);
            mergeCharacter.append(foo.charAt(0));
            for (char g : mylist2) {
                mergeCharacter.append(g);
            }
            if (s.charAt(foo.length() - 1) == '.' || s.charAt(foo.length() - 1) == ',') {
                mergeCharacter.append(foo.charAt(foo.length() - 2));
            }
            mergeCharacter.append(foo.charAt(foo.length() - 1));
            mergeCharacter.append(" ");
            result = mergeCharacter.toString();
        }
    }

    public static String fileToString(String str1) throws FileNotFoundException {
        FileReader file1 = new FileReader(str1);
        Scanner scan = new Scanner(file1);
        String text = scan.nextLine();
        scan.close();
        return text;
    }

    public static ArrayList<String> splitString(String str1) {
        String[] arrStr = str1.split(" ");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(arrStr));
        int index = 0;
        for (String str : arrStr) {
            if (str.charAt(str.length() - 1) == '.') {
                strList.add(index, ".");
            } else if (str.charAt(str.length() - 1) == ',') {
                strList.add(index, ",");
            }
            index++;
        }
        return strList;
    }

    public static ArrayList<Character> convertToCharList(String str) {
        ArrayList<Character> result = new ArrayList<>();
        for (char c : str.toCharArray()) {
            result.add(c);
        }
        return result;
    }

    public static boolean compareCharList(ArrayList<Character> list1, ArrayList<Character> list2) {
        if (list1.size() != list2.size())
            return false;
        else {
            for (int i = 0; i < list1.size(); i++) {
                if (!list1.get(i).equals(list2.get(i))) {
                    System.out.println(list1.get(i));
                    System.out.println(list2.get(i));
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean checkTwoString(ArrayList<String> str1List, ArrayList<String> str2List) {
        if (str1List.size() != str2List.size()) {
            System.out.println("false by size");
            return false;
        }
        int index = 0;
        for (String str1 : str1List) {
            String str2 = str2List.get(index);
            if (str1.length() != str2.length()) {
                System.out.println("false by length");
                return false;
            }
            if (str1.length() < 4 && str1.equals(str2)) {
                index++;
                continue;
            } else if (str1.charAt(0) == str2.charAt(0)
                    && str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1)) {
                ArrayList<Character> charStr1List = convertToCharList(str1.substring(1, str1.length() - 2));
                ArrayList<Character> charStr2List = convertToCharList(str2.substring(1, str2.length() - 2));
                Collections.sort(charStr1List);
                Collections.sort(charStr2List);
                if (compareCharList(charStr1List, charStr2List) == false) {
                    System.out.println("false by compare");
                    return false;
                }
            }
            index++;
        }
        return true;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String text1 = fileToString("text1.txt");
        String text2 = fileToString("text2.txt");
        ArrayList<String> text1Arr = splitString(text1);
        ArrayList<String> text2Arr = splitString(text2);
        if (checkTwoString(text1Arr, text2Arr) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
