import hackerranck.DiagonalDifference;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        // Diagonal Difference
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        List<Integer> second = new ArrayList<>();
        second.add(5);
        second.add(6);
        second.add(7);
        second.add(8);
        List<Integer> third = new ArrayList<>();
        third.add(9);
        third.add(10);
        third.add(11);
        third.add(12);
        List<Integer> fourth = new ArrayList<>();
        fourth.add(13);
        fourth.add(14);
        fourth.add(15);
        fourth.add(20);
        arr.add(first);
        arr.add(second);
        arr.add(third);
        arr.add(fourth);
        System.out.println(DiagonalDifference.getDiagonalDifference(arr));
    }
}
