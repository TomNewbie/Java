import java.util.Set;

import java.util.*;

public class FindDups2 {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups    = new HashSet<String>();
         uniques.add("A");
         uniques.add("B");
         uniques.add("C");
         uniques.add("A");
         uniques.add("E");
         uniques.add("D");
        for (String a : args)
            if (!uniques.add(a))
                dups.add(a);
        // Destructive set-difference
       uniques.removeAll(dups);

        System.out.println("Unique words:    " + uniques);
        System.out.println("Duplicate words: " + dups);
    }
}
