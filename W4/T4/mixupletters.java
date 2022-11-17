import java.io.*;
import java.io.Filewriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
public class mixupletters {


	public static void main(String[] args) throws Exception {
	
		File read=new File("textin.txt");  
		FileWriter writing=new FileWriter("textout.txt");
		String temp2=null;;
		Scanner scan=new Scanner(read);
		BufferedReader buff= new BufferedReader(new FileReader(read));
		String myword="";
		String line=null;
		String str=null;
		StringBuilder newstr=new StringBuilder();
		while((line=buff.readLine())!=null) {
			myword+=line;
			myword+=' ';
		}
	
		ArrayList<String> mylist=new ArrayList<>(Arrays.asList(myword.split(" ")));
      
		
	for(String s:mylist) {
		String foo=s;
    	Random rand=new Random();
    	
    	ArrayList<Character> mylist2=new ArrayList<Character>();
    	str=foo.substring(1,foo.length()-1);
    	char[] w=str.toCharArray();
    	for(char c: w) {
    		mylist2.add(c);
    	}
    	Collections.shuffle(mylist2);
    	 newstr.append(foo.charAt(0));
    	 for(char g:mylist2) {
    		 newstr.append(g);
    	 }
    	 newstr.append(foo.charAt(foo.length()-1));
          newstr.append(" ");
           temp2=newstr.toString();}
        writing.write(temp2);
    	 
	
	 System.out.println(temp2);
	 writing.close();
	
	         
}} 
