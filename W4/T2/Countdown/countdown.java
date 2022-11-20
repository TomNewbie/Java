import java.util.*;

public class countdown {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("Please enter the startvalue: ");
        Scanner s = new Scanner(System.in);
        int time = s.nextInt();
        // Integer.parseInt(args[0]);
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = time; i >= 0; i--)
            queue.add(i);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
            Thread.sleep(1000);
        }
        s.close();
    }
}
