class Solution {
    public int longestConsecutive(int[] nums) {
        int count =1;
        Arrays.sort(nums);
        int mc=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]== nums[i-1]+1){
                count++;
                mc = Math.max(count,mc);
            }else if(nums[i]== nums[i-1]){
                continue;
            }else{
                count=1;
            }

        }
        return mc;
    }
}
