import java.util.Scanner;

public class parking {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int d, e, f, g, h, i,j;
    int[] mynumbers = {0, read.nextInt(), read.nextInt(), read.nextInt()};
   
    d = read.nextInt();
    e = read.nextInt();
    f = read.nextInt();
    g = read.nextInt();
    h = read.nextInt();
    i = read.nextInt();
    int currentnum = 0;
    int num = 0;
    for (j = 1; j < 100; j++) {
      if(j == d) {
        currentnum++;}
      if(j == f) {
        currentnum++;}
      if(j == h) {
        currentnum++;}
      if(j == e) {
        currentnum--;}
      if(j == g) {
        currentnum--;}
      if(j == i) {
        currentnum--;}
      num+=currentnum * mynumbers[currentnum];
    }
    System.out.println(num);
  }
}
