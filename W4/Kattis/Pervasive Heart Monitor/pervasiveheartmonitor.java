import java.util.Scanner;

// package Kattis.Pervasive Heart Monitor;

public class pervasiveheartmonitor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String input = scan.nextLine();
            String[] stringArr = input.split(" ");
            int start = 0;
            int end = 0;
            boolean begin = false;
            for (int i = 0; i < stringArr.length; i++) {
                if (stringArr[i].matches("[a-zA-Z]+")) {
                    if (begin == false) {
                        start = i;
                        begin = true;
                    } else {
                        end = i;
                    }
                }
            }
            if (end == 0)
                end = start;
            double average = 0;
            int index = start == 0 ? end + 1 : 0;
            int indexEnd = end == stringArr.length - 1 ? start - 1
                    : stringArr.length - 1;
            for (int t = index; t <= indexEnd; t++) {
                average += Double.parseDouble(stringArr[t]);
            }
            average = average / (indexEnd - index + 1);
            String name = new String("");
            for (int t = start; t <= end; t++) {
                name += stringArr[t];
                name += " ";
            }
            System.out.println(String.format("%.6f", average) + " " + name);
        }
    }
}
