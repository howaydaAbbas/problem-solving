package leetcode;

public class RemoveDuplicatesFromSortedArrayII {

    public static int removeDuplicates(int[] nums) {

        if(nums.length == 0) return 0;

        int k = 1;
        int occurrence = 1;
        for(int i=1; i < nums.length; i++){
            if(nums[i] != nums[k-1]){
                nums[k] = nums[i];
                k++;
                occurrence = 1;
            } else {
                if (occurrence < 2) {
                    nums[k] = nums[i];
                    k++;
                }
                occurrence++;
            }
        }
        return k;

        /* better solution
        if (nums.length <= 2) return nums.length;

        int k = 2; // Start from the third element
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
         */
    }
}
