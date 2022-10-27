package Kattis;

import java.util.ArrayList;
import java.util.Scanner;

public class misa {
    public static int posx[] = { 1, -1, 0 };
    public static int posy[] = { 1, -1, 0 };

    public static int countShake(int x, int y, int row, int col, ArrayList<String> seating) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (posx[i] == 0 && posy[j] == 0)
                    continue;
                int newPosx = x + posx[i];
                int newPosy = y + posy[j];
                if (newPosx < 0 || newPosx >= row || newPosy >= col || newPosy < 0)
                    continue;
                else {
                    if (seating.get(newPosx).charAt(newPosy) == 'o')
                        count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        ArrayList<String> seating = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            seating.add(scan.next());
        }
        int maxShake = 0;
        int posXMirko = -1;
        int posYMirko = -1;
        // find position for mirko
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (seating.get(i).charAt(j) == '.') {
                    int numShake = countShake(i, j, row, col, seating);
                    if (numShake > maxShake) {
                        maxShake = numShake;
                        posXMirko = i;
                        posYMirko = j;
                    }
                }
            }
        }
        if (posXMirko != -1) {
            StringBuilder test = new StringBuilder(seating.get(posXMirko));
            test.setCharAt(posYMirko, 'o');
            seating.set(posXMirko, test.toString());
        }
        int totalShake = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (seating.get(i).charAt(j) == 'o') {
                    totalShake += countShake(i, j, row, col, seating);

                }
            }
        }
        System.out.println(totalShake / 2);
    }
}
