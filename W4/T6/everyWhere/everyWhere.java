
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: I've Been Everywhere, Man
* Link: https://open.kattis.com/contests/tbnznz/problems/everywhere
* @author Trần Hoàng Kim 
* @version 1.0, 2022-11-18
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.15s 
*/

import java.util.Scanner;
import java.util.*;

public class everyWhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numWorkTrip = sc.nextInt();
        for (int i = 0; i < numWorkTrip; i++) {
            int numCities = sc.nextInt();
            Set<String> visitedCities = new HashSet<String>();
            for (int j = 0; j < numCities; j++) {
                visitedCities.add(sc.next());
            }
            System.out.println(visitedCities.size());
        }
        sc.close();
    }
}
