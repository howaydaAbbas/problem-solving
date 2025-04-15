package leetcode;

public class Solution {

    public static void main(String[] args) {

        // Merge sorted Array
        int[] num1 = {1, 2, 3, 0, 0};
        int[] num2 = {1, 4};
        MergeSortedArray.merge(num1, 3, num2, 2);
        for (int j : num1) {
            System.out.println(j);
        }
    }
}
