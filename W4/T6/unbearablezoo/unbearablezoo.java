import java.util.*;

/**
 * Advanced Object Oriented Programming with Java, WS 2022
 * Problem: Problem A Un-bear-able Zoo
 * Link: https://open.kattis.com/contests/tbnznz/problems/zoo
 * 
 * @author Ferid Gökkaya
 * @version 1.0, 2022-11-14
 * 
 *          Method : Ad-Hoc
 *          Status : Accepted
 *          Runtime: 0.102
 */

public class unbearablezoo {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = 0, j;
        int num2 = 0, num3 = 0;
        while (true) {
            num2 = Integer.parseInt(read.nextLine());
            if (num2 == 0) {
                return;
            }
            HashMap<String, Integer> myAnimals = new HashMap<String, Integer>();
            ArrayList<String> mylist = new ArrayList<String>();
            for (j = 0; j < num2; j = j + 1) {
                String animal[] = read.nextLine().split(" ");
                int length = animal.length;
                animal[length - 1] = animal[length - 1].toLowerCase();
                if (!myAnimals.containsKey(animal[length - 1])) {
                    myAnimals.put(animal[length - 1], 1);
                    mylist.add(animal[length - 1]);
                } else {
                    num3 = myAnimals.get(animal[length - 1]);
                    myAnimals.replace(animal[length - 1], num3 + 1);
                }
            }

            System.out.println("List " + ++num + ":");

            Collections.sort(mylist);
            for (String foo : mylist) {
                System.out.println(foo + " | " + myAnimals.get(foo));
            }
        }
    }
}
