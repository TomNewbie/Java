import java.util.Scanner;

public class beautifulprimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTest = scan.nextInt();
        for (int i = 0; i < numTest; i++) {
            int size = scan.nextInt();
            int max = (int) Math.pow(10, size - 1) * 9;
            int ditconme = size;
            while ((float) max / (Math.pow(11, ditconme) * Math.pow(2, size - ditconme)) >= 1
                    && (float) max / (Math.pow(11, ditconme) * Math.pow(2, size - ditconme)) <= 9) {
                ditconme--;
            }
            for (int j = 0; j < size - ditconme; j++) {
                System.out.print("2 ");
            }
            for (int j = 0; j < ditconme; j++) {
                System.out.print("11 ");
            }
            System.out.println();
        }
    }
}
