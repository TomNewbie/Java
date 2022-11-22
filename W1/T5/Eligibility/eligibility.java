
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Eligibility
* Link: https://open.kattis.com/contests/mjt68e/problems/eligibility
* @author Tho Phan Chi
* @version 1.0,2022-10-27
* 
* Method : Algebra
* Run-time: 0.57
* Status : Accepted
*/
import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            String name = scan.next();
            String postStudyDate = scan.next();
            String birthDate = scan.next();
            int numCourse = scan.nextInt();
            String result = "";
            if (Integer.parseInt(postStudyDate.substring(0, 4)) >= 2010) {
                result += "eligible";
            } else if (Integer.parseInt(birthDate.substring(0, 4)) >= 1991) {
                result += "eligible";
            } else if (numCourse > 40) {
                result += "ineligible";
            } else {
                result += "coach petitions";
            }
            System.out.println(name + " " + result);
        }
        scan.close();
    }
}
