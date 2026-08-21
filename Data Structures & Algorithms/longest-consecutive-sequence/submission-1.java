class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int mc = 1;
        if(nums.length==0){
            return 0;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                count = count + 1;
                mc = Math.max(mc, count);

            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                count = 1;
            }
        }
        return mc;
    }
}
