/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Compound Words
* Link: https://open.kattis.com/contests/uk27ry/problems/compoundwords
* @author Trần Hoàng Kim 
* @version 1.0, 2022-11-12
*
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.15s 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class compoundWords {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> arrList = new ArrayList<>();
    while (sc.hasNext()) {
      arrList.add(sc.next());
    }
    HashSet<String> compounds = new HashSet<>();
    for (int i = 0; i < arrList.size(); i++) {
      for (int j = 0; j < arrList.size(); j++) {
        if (i == j)
          continue;
        compounds.add(arrList.get(i) + arrList.get(j));
      }
    }
    String[] output = compounds.toArray(new String[0]);
    Arrays.sort(output);
    for(String foo: output)
      System.out.println(foo);
  }
}
