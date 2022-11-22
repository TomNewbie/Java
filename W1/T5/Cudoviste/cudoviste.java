
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Cudoviste
* Link: https://open.kattis.com/contests/mjt68e/problems/cudoviste
* @author Tho Phan Chi
* @version 1.0,2022-10-27
* 
* Method : Ad-Hoc
* Run-time: 0.11
* Status : Accepted
*/
import java.util.ArrayList;
import java.util.Scanner;

public class cudoviste {
    public static int posx[] = { 1, 0 };
    public static int posy[] = { 1, 0 };

    // Function count number of place to park given that it has to crash amount of
    // car
    public static int countPark(int row, int col, ArrayList<String> map, int crash) {

        int total = 0;
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < col; y++) {
                Boolean nocount = false;
                int numCrash = 0;
                if (map.get(x).charAt(y) == '#')
                    continue;
                else if (map.get(x).charAt(y) == 'X')
                    numCrash++;
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (posx[i] == 0 && posy[j] == 0)
                            continue;
                        int newPosx = x + posx[i];
                        int newPosy = y + posy[j];
                        if (newPosx < 0 || newPosx >= row || newPosy >= col || newPosy < 0) {
                            nocount = true;

                        } else if (map.get(newPosx).charAt(newPosy) == '#') {
                            nocount = true;
                        } else if (map.get(newPosx).charAt(newPosy) == 'X') {
                            numCrash++;
                        }
                    }
                }
                if (numCrash == crash && nocount == false)
                    total++;
            }
        }
        return total;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        ArrayList<String> map = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            map.add(scan.next());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(countPark(row, col, map, i));
        }
        scan.close();
    }
}
