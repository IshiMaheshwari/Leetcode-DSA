class Solution {
    public int missingNumber(int[] nums) {
        int index,v;
        for(v=0,index=0;index<nums.length;index++) v=((v^index)^nums[index]);
        return (v^index);
    }
}