import java.util.*;
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: Problem B Saving Daylight
* Link: https://open.kattis.com/contests/tbnznz/problems/savingdaylight
* @author Ferid Gökkaya
* @version 1.0,2022-11-14
* 
* Method : Ad-Hoc
* Status : Accepted
* Runtime: 0.102
*/
public class savingdaylight {
     public static void show() {
          Scanner sc = new Scanner(System.in);
          String monat,day,year,actual,start;
                        while (sc.hasNext()) {
                             monat = sc.next();
                             day = sc.next();
                             year = sc.next();
                             actual = sc.next();
                             start = sc.next();

                            int i = actual.indexOf(':');
                            int currenthour = Integer.parseInt(actual.substring(0, i));
                            int currentmin = Integer.parseInt(actual.substring(i + 1));

                            int u = start.indexOf(':');
                            int starthour = Integer.parseInt(start.substring(0, u));
                            int startminute = Integer.parseInt(start.substring(u + 1));

                            int h = 0;
                            int min = 0;
                            if (currentmin <= startminute) {
                                min = startminute - currentmin;
                                h = starthour - currenthour;
                            } else {
                                min = (60 - currentmin) + startminute;
                                h = starthour - currenthour - 1;
                            }
                            System.out.println(monat + " " + day + " " + year + " " + h + " hours " + min + " minutes");
                        }
     }
         public static void main(String[] args) {
              show();
    }

}
