import java.util.Scanner;
import java.util.*;

public class bela {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cardsPerDeck = sc.nextInt();
        String suit = sc.next();
        List<Character> cardType = Arrays.asList(new Character[] { 'A', 'K', 'Q', 'J', 'T', '9', '8', '7' });
        List<Integer> dominantList = Arrays.asList(new Integer[] { 11, 4, 3, 20, 10, 14, 0, 0 });
        List<Integer> notDominantList = Arrays.asList(new Integer[] { 11, 4, 3, 2, 10, 0, 0, 0 });
        int totalPoints = 0;
        for (int i = 0; i < 4 * cardsPerDeck; i++) {
            String cardName = sc.next();
            if (cardName.charAt(1) == suit.charAt(0)) {
                int index = cardType.indexOf(cardName.charAt(0));
                totalPoints += dominantList.get(index);
            } else {
                int index = cardType.indexOf(cardName.charAt(0));
                totalPoints += notDominantList.get(index);
            }
        }
        System.out.println(totalPoints);
        sc.close();
    }
}
