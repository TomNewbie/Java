
public class TestBikes  {

	public static void main(String[] args) throws CloneNotSupportedException{
		Bicycle bike01, bike02, bike03;

	    bike01 = new Bicycle(20, 10, 1);
	    bike02 = new MountainBike(20, 10, 5, "Dual");
	    bike03 = new Roadbike(40, 20, 8, 23);

	    bike01.printDescription();
	    bike02.printDescription();
	    bike03.printDescription();
	    Bicycle myBike=(Bicycle)bike01.clone();
	    if(myBike instanceof Bicycle) {
	    	System.out.println("Yes");
	    }
	    myBike.printDescription();
	    System.out.println(bike01.equals(bike02));
	    System.out.println(bike01.toString());
	    System.out.println(bike01.getClass());
	    System.out.println(bike01.hashCode());
	    
	}

}
