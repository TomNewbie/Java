import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class mixupletters {

	public static void main(String[] args) throws Exception {

		File read = new File("textin.in");
		FileWriter writing = new FileWriter("text.out");
		String temp2 = null;
		Scanner scan = new Scanner(read);
		BufferedReader buff = new BufferedReader(new FileReader(read));
		String myword = "";
		String line = null;
		String str = null;
		StringBuilder newstr = new StringBuilder();

		while ((line = buff.readLine()) != null) {
			myword += line;
			myword += ' ';
		}
		ArrayList<String> mylist = new ArrayList<>(Arrays.asList(myword.split(" ")));

		for (String s : mylist) {
			String foo = s;
			ArrayList<Character> mylist2 = new ArrayList<Character>();
			// skip for period . and comma ,
			if (s.charAt(foo.length() - 1) == '.' || s.charAt(foo.length() - 1) == ',') {
				str = foo.substring(1, foo.length() - 2);
			} else {
				str = foo.substring(1, foo.length() - 1);
			}

			char[] w = str.toCharArray();
			// Create a list for shuffle charater
			for (char c : w) {
				mylist2.add(c);
			}
			Collections.shuffle(mylist2);
			newstr.append(foo.charAt(0));
			for (char g : mylist2) {
				newstr.append(g);
			}
			if (s.charAt(foo.length() - 1) == '.' || s.charAt(foo.length() - 1) == ',') {
				newstr.append(foo.charAt(foo.length() - 2));
			}
			newstr.append(foo.charAt(foo.length() - 1));
			newstr.append(" ");
			temp2 = newstr.toString();
		}
		writing.write(temp2);

		System.out.println("Write successfully");
		buff.close();

		writing.close();
		scan.close();
	}
}
