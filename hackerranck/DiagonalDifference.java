package hackerranck;

import java.util.List;

// Hacker Rank
public class DiagonalDifference {

    public static int getDiagonalDifference(List<List<Integer>> arr) {

        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        int diagonalSize = arr.size();
        for (int i = 0; i < diagonalSize; i++){
            List<Integer> currentDiagonal = arr.get(i);
            firstDiagonalSum += currentDiagonal.get(i);
            secondDiagonalSum += currentDiagonal.get(diagonalSize-i-1);
        }
        return Math.abs(firstDiagonalSum-secondDiagonalSum);
    }
}
