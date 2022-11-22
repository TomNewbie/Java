
/**
* Advanced Object Oriented Programming with Java, WS 2022
* Problem: What does the fox say

* Link: https://open.kattis.com/contests/tbnznz/problems/whatdoesthefoxsay
* @author Tho Phan Chi
* @version 1.0,2022-11-20
* 
* Status : Accepted
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class whatdoesthefoxsay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTest = scan.nextInt();
        scan.nextLine();
        String terminate = new String("what does the fox say?");
        for (int i = 0; i < numTest; i++) {
            String record = scan.nextLine();
            String[] soundArr = record.split(" ");

            ArrayList<String> soundArrList = new ArrayList<>(Arrays.asList(soundArr));
            String animal = scan.nextLine();
            ArrayList<String> animalSound = new ArrayList<>();
            while (!animal.equals(terminate)) {
                String[] splitAnimal = animal.split(" ");
                String sound = splitAnimal[splitAnimal.length - 1];
                animalSound.add(sound);
                animal = scan.nextLine();
            }
            // delete other sound in soundArr
            for (String noise : animalSound) {
                while (soundArrList.remove(noise))
                    ;
            }
            for (String fox : soundArrList) {
                System.out.print(fox + " ");
            }
            System.out.println();
        }

    }
}
