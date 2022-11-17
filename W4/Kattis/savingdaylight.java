import java.util.*;

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