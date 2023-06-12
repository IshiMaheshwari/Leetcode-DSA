class Solution {
public int maxSubArray(int[] nums) {
int lmax=nums[0];
int gmax=nums[0];
int j;
for(int i=1;i<nums.length;i++)
{
j=nums[i]+lmax;
lmax=(nums[i]>j)?nums[i]:j;
gmax=(gmax>lmax)?gmax:lmax;
}
return gmax;
}
}