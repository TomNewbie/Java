import java.util.Scanner;

public class conundrum {
    public static void main (String[] args) {
        String text = "PER";
        for (int i = 1; i < 100; i++) {
            text += "PER";
        }

        Scanner sc = new Scanner(System.in);
        String sample = sc.next();
        sc.close();
        int dayChange = 0;
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) != text.charAt(i)) {
                dayChange++;
            }
        }

        System.out.println(dayChange);
    }
}
