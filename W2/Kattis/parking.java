import java.util.Scanner;

public class parking {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    int arrivalTime1, departTime1, arrivalTime2, departTime2, arrivalTime3, departTime3,j;
    // Price corresponding to number of cars
    int[] priceOfParking = {0, read.nextInt(), read.nextInt(), read.nextInt()};
   
    arrivalTime1 = read.nextInt();
    departTime1 = read.nextInt();
    arrivalTime2 = read.nextInt();
    departTime2 = read.nextInt();
    arrivalTime3 = read.nextInt();
    departTime3 = read.nextInt();
    
    int currentCarNum = 0;
    int sumCost = 0;
    for (j = 1; j < 100; j++) {
      if(j == d) {
        currentCarNum++;}
      if(j == f) {
        currentCarNum++;}
      if(j == h) {
        currentCarNum++;}
      if(j == e) {
        currentCarNum--;}
      if(j == g) {
        currentCarNum--;}
      if(j == i) {
        currentCarNum--;}
      // mynumbers[currentnum]: choose the price corresponding to the number of cars
      sumCost+=currentCarNum * priceOfParking[currentCarNum];
    }
    System.out.println(sumCost);
  }
}
