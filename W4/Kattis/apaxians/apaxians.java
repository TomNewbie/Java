import java.util.Scanner;
public class apaxians {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    String word=scan.nextLine();
    char[] myarray=word.toCharArray();
    int i;
    String str="";
    char temp=' ';
    for(char it: myarray) {
    	if(it!=temp) {
    	
    	str+=it;
    		temp=it;
    	}
    }
    System.out.println(str);
	}

}
