
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Problem C Ladder
* Link:  https://open.kattis.com/contests/mjt68e/problems/ladder
* @author Ferid Gökkaya
* @version 1.0, 2022-10-21
* 
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.102
*/
import java.util.Scanner;

public class ladder {

    public static void main(String[] args) {
        double h;
        double v;

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Scanner scanner2 = new Scanner(input);
        h = scanner2.nextDouble();
        v = scanner2.nextDouble();
        System.out.println((int) (Math.ceil(h / (Math.sin(v * Math.PI / 180)))));
    }
}
