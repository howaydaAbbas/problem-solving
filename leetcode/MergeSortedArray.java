package leetcode;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;           // Last element of nums1 part
        int j = n - 1;           // Last element of nums2
        int k = m + n - 1;       // Last position in nums1 (where we'll fill)

        // Compare elements from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]; // Copy from nums1
            } else {
                nums1[k--] = nums2[j--]; // Copy from nums2
            }
        }

        // If nums2 still has elements left
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
