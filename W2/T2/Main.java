package T2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bicycle bike = new Bicycle(70, 20, 30);
		Mountainbike falcon = new Mountainbike(4, 80, 12, 44);
		Mountainbike falcon2 = new Mountainbike(4, 80, 12, 44);
		System.out.println(
				"Constructor bike: \n" + "Cadence: " + bike.cadence + " Gear: " + bike.gear + " Speed: " + bike.speed);
		System.out.println("Constructor falcon: \n" + "Cadence: " + falcon.cadence + " Gear: " + falcon.gear
				+ " Speed: " + falcon.speed + " Seathight: " + falcon.seatHeight);
		System.out.println("Constructor falcon2: \n" + "Cadence: " + falcon2.cadence + " Gear: " + falcon2.gear
				+ " Speed: " + falcon2.speed + " Seathight: " + falcon2.seatHeight);
	}

}
