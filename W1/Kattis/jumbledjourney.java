package Kattis;

import java.util.Scanner;

// on progress not finish yet
public class jumbledjourney {
    static int[][] parks_map = new int[100][100];
    static int vertexNum;
    static int[] topo = new int[100];
    static int pointer = 0;
    static int[] alreadyAdd = new int[100];

    static void topoSort(int index, int vertexNum) {
        if (alreadyAdd[index] == 1)
            return;
        for (int i = 0; i < vertexNum; i++) {
            if (parks_map[i][index] == 0 || parks_map[i][index] == -1) {
                System.out.println("null");
                continue;
            } else {
                System.out.println(alreadyAdd[i]);
                if (alreadyAdd[i] == 0) {
                    topoSort(i, vertexNum);
                }
            }
        }
        topo[pointer] = index;
        pointer++;
        alreadyAdd[index] = 1;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int vertexNum = scan.nextInt();
        for (int i = 0; i < vertexNum; i++) {
            alreadyAdd[i] = 0;
            for (int j = 0; j < vertexNum; j++) {
                parks_map[i][j] = scan.nextInt();
            }
        }

        while (pointer < vertexNum) {
            topoSort(pointer, vertexNum);
        }

    }
}
