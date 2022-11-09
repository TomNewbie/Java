package W2.Kattis;

import java.util.Scanner;

public class boundingrobots {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int l = scan.nextInt();
        while (w != 0 && l != 0) {
            int count = scan.nextInt();
            int positionRobot_x = 0;
            int positionReal_x = 0;
            int positionRobot_y = 0;
            int positionReal_y = 0;
            for (int i = 0; i < count; i++) {
                String instruction = scan.next();
                int step = scan.nextInt();
                if (instruction.charAt(0) == 'u') {
                    positionRobot_y += step;
                    positionReal_y += step;
                    if (positionReal_y < 0)
                        positionReal_y = 0;
                    else if (positionReal_y >= l)
                        positionReal_y = l - 1;
                } else if (instruction.charAt(0) == 'd') {
                    positionRobot_y -= step;
                    positionReal_y -= step;
                    if (positionReal_y < 0)
                        positionReal_y = 0;
                    else if (positionReal_y >= l)
                        positionReal_y = l - 1;
                } else if (instruction.charAt(0) == 'l') {
                    positionRobot_x -= step;
                    positionReal_x -= step;
                    if (positionReal_x < 0)
                        positionReal_x = 0;
                    else if (positionReal_x >= w)
                        positionReal_x = w - 1;
                } else {
                    positionRobot_x += step;
                    positionReal_x += step;
                    if (positionReal_x < 0)
                        positionReal_x = 0;
                    else if (positionReal_x >= w)
                        positionReal_x = w - 1;
                }
            }
            w = scan.nextInt();
            l = scan.nextInt();

            System.out.println("Robot thinks " + positionRobot_x + " " + positionRobot_y);
            System.out.println("Actually at " + positionReal_x + " " + positionReal_y);
            System.out.println();
        }
        scan.close();

    }
}
