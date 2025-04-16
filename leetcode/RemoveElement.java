package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {

        int k = 0; // Pointer to place the next non-val element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
