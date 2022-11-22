
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: 	Bacon, Eggs, and Spam

* Link: https://open.kattis.com/contests/tbnznz/problems/baconeggsandspam
* @author Tho Phan Chi
* @version 1.0,2022-11-20
* 
* Status : Accepted
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class baconeggsandspam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while (num != 0) {
            scan.nextLine();
            HashMap<String, ArrayList<String>> dishes = new HashMap<>();
            for (int i = 0; i < num; i++) {
                String dinnerOrder = scan.nextLine();
                String[] arrOrder = dinnerOrder.split(" ");
                String name = arrOrder[0];
                for (int j = 1; j < arrOrder.length; j++) {
                    if (!dishes.containsKey(arrOrder[j])) {
                        ArrayList<String> names = new ArrayList<>();
                        names.add(name);
                        dishes.put(arrOrder[j], names);
                    } else {
                        ArrayList<String> names = dishes.get(arrOrder[j]);
                        names.add(name);
                        dishes.replace(arrOrder[j], names);
                    }

                }
            }

            ArrayList<String> arrDish = new ArrayList<>();
            dishes.forEach((dish, dname) -> {
                arrDish.add(dish);
                Collections.sort(dishes.get(dish));
            });

            Collections.sort(arrDish);
            for (String i : arrDish) {
                System.out.print(i + " ");
                for (String name : dishes.get(i)) {
                    System.out.print(name + " ");
                }
                System.out.println();
            }
            System.out.println();
            num = scan.nextInt();
        }
    }
}