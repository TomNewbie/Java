import java.util.*;

public class securedoors {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int lines = read.nextInt();
		ArrayList<String> buildings = new ArrayList<>();

		for (int i = 0; i < lines; i++) {
			String track = read.next();
			String name = read.next();

			if (track.equals("entry")) {
				System.out.print(name + " entered");

				if (buildings.contains(name))
					System.out.println(" (ANOMALY)");
				else {
					buildings.add(name);
					System.out.println();
				}
			} else {
				System.out.print(name + " exited");

				if (!buildings.contains(name))
					System.out.println(" (ANOMALY)");
				else {
					buildings.remove(name);
					System.out.println();
				}
			}
		}
	}
}
