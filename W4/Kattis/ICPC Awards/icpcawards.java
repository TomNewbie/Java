import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class icpcawards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTeams = scan.nextInt();
        HashSet<String> teams = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();
        int winner = 0;
        scan.nextLine();
        for (int i = 0; i < numTeams; i++) {
            String team = scan.nextLine();
            String university = team.split(" ")[0];
            if (winner == 12) {
                continue;
            }
            if (teams.contains(university)) {
                continue;
            } else {
                teams.add(university);
                result.add(team);
                winner++;
            }
        }
        for (String i : result) {
            System.out.println(i);
        }
    }
}
