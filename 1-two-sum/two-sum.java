class Solution {
    public int[] twoSum(int[] nums, int target) {
        int out[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) { // start from i+1
                if (nums[j] == rem) {
                    out[0] = i;
                    out[1] = j;
                    return out; // return immediately when found
                }
            }
        }
        return new int[]{-1, -1}; // if not found
    }
}
