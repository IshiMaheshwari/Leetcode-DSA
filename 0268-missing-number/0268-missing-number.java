class Solution {
    public int missingNumber(int[] nums) {
        int index,v;
        int n=nums.length;
        for(index=0,v=0;index<nums.length;index++)
        {
            v=(v^index)^nums[index];
        }
        return v^index;
    }
}