package leetcode;

public class Solution {

    public static void main(String[] args) {

        // Merge sorted Array
        /* int[] num1 = {1, 2, 3, 0, 0};
        int[] num2 = {1, 4};
        MergeSortedArray.merge(num1, 3, num2, 2);
        for (int j : num1) {
            System.out.println(j);
        } */

        // Remove element
       /* int[] nums = {3,2,2,3};
        System.out.println(RemoveElement.removeElement(nums, 3)); */

        // Remove Duplicates from sorted array
        /* int[] nums = {0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5};
        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(nums)); */

        // Remove Duplicates from sorted arrayII
        int[] nums = {0,0,1,1,1,1,2,3,3};
        System.out.println(RemoveDuplicatesFromSortedArrayII.removeDuplicates(nums));
    }
}
