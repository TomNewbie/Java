package T2;

public class Mountainbike extends Bicycle {
	public int seatHeight;

	// the MountainBike subclass has
	// one constructor
	public Mountainbike(int startHeight, int startCadence,
			int startSpeed, int startGear) {
		super(startCadence, startSpeed, startGear);
		seatHeight = startHeight;
	}

	// the MountainBike subclass has
	// one method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
}
