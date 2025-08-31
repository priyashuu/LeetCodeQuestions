class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n]; // find result in array 

        int zeroCount = 0; // initialise as  0  
        int totalProduct = 1; 

        for (int i = 0 ;  i<n ; i ++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                totalProduct *= nums[i];
            }
        }

        // Step 2: Build result based on zero count
        for (int i = 0; i < n; i++) {
            if (zeroCount > 1) {
                result[i] = 0; 
            } else if (zeroCount == 1) {
                result[i] = (nums[i] == 0) ? totalProduct : 0;
            } else {
                result[i] = totalProduct / nums[i];
            }
        }

        return result;
    }
}
