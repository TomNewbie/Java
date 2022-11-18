import java.util.Scanner;
import java.util.*;

public class everyWhere {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
        int numWorkTrip = sc.nextInt();
        for (int i = 0; i < numWorkTrip; i++) {
            int numCities = sc.nextInt();
            Set<String> visitedCities = new HashSet<String>();
            for(int j = 0; j < numCities; j++) {
                visitedCities.add(sc.next());
            }
            System.out.println(visitedCities.size());
        }
        sc.close();
    }
}
