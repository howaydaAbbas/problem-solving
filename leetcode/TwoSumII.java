package leetcode;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {

       /* int[] positions = new int[2];
        for(int i = 0; i < numbers.length-1 ; i++){
            for(int j = i+1 ; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target){
                    positions[0] = i+1;
                    positions[1] = j+1;
                    return positions;
                }
            }
        }
        return positions;

        */

        // Better complexity
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Return 1-based indices
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++; // Need a larger number
            } else {
                right--; // Need a smaller number
            }
        }

        return new int[0]; // Problem guarantees one solution, so this won't be reached
    }
}
