package src;

import java.util.ArrayList;

public class Arr {
    public static void main(String[] args) {
        int[] rolls = {1, 2, 3};
        String[] dam = {"dami", "gbemi"};

        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6, 5},
                {7, 8}
        };
        rolls[2] = 2;
        System.out.println(mat[1][2] + " " + " dgdgdg");

        for (int i = 0; i < mat.length; i++) {
            for (int col = 0; col < mat[i].length; col++) {
                System.out.print(mat[i][col] + " ");
            }
            System.out.println();
        }

        ArrayList<Integer> list = new ArrayList<Integer>();

    }
}
