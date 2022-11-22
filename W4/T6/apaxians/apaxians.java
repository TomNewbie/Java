import java.util.Scanner;

/**
 * Advanced Object Oriented Programming with Java, WS 2022
 * Problem: Problem J Apaxiaaaaaaaaaaaans!
 * Link: https://open.kattis.com/contests/tbnznz/problems/apaxiaaans
 * 
 * @author Ferid Gökkaya
 * @version 1.0, 2022-11-16
 * 
 *          Method : Ad-Hoc
 *          Status : Accepted
 *          Runtime: 0.102
 */
public class apaxians {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    char[] myarray = word.toCharArray();
    int i;
    String str = "";
    char temp = ' ';
    for (char it : myarray) {
      if (it != temp) {

        str += it;
        temp = it;
      }
    }
    System.out.println(str);
  }

}
