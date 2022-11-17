public class RandomSeq {

	public static void main(String[] args) {
		int i;
     	int elements=Integer.parseInt(args[0]);
		int array[]= new int[elements];
		   
		   
		   for(i=0;i<elements;i++){
		    array[i]=(int)Math.random(); }
		 
		  for(i=0;i<elements;i++){
		  System.out.print(array[i]+" ");
		  }

	}

}
