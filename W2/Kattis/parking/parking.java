import java.util.Scanner;

public class parking {

  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int A, B, C, g, h, j, i;
    int l = 0;
    int[] mynumbers = { 0, read.nextInt(), read.nextInt(), read.nextInt() };

    A = read.nextInt();
    B = read.nextInt();
    C = read.nextInt();
    g = read.nextInt();
    h = read.nextInt();
    i = read.nextInt();
    int currentnum = 0;
    int num = 0;
    for (j = 1; j < 100; j++) {
      if (j == A) {
        currentnum++;
      }
      if (j == B) {
        currentnum++;
      }
      if (j == C) {
        currentnum++;
      }
      if (j == h) {
        currentnum++;
      }
      if (j == g) {
        currentnum--;
      }
      if (j == i) {
        currentnum--;
      }
      num += currentnum * mynumbers[currentnum];
    }
    System.out.println(num);
  }
}
