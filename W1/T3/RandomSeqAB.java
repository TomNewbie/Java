public class RandomSeqAB {

	public static void main(String[] args) {
		int from = Integer.parseInt(args[0]);
		int until= Integer.parseInt(args[1]);
		int numberofnumbers=Integer.parseInt(args[2]);
		int num=0;
		for(int i=0;i<numberofnumbers;i++) {
			num=(int)(Math.random()*until-from+1)+from;
			System.out.print(num+" ");
		}

	}

}
