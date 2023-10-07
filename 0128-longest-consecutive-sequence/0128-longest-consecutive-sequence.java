class Solution {
    public int longestConsecutive(int[] nums) {
       int n=nums.length;
        if(n==0) return 0;
       Arrays.sort(nums);
        int longest=1;
        int count=0;
        int lastSmaller=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]-1==lastSmaller)
            {
                count=count+1;
                lastSmaller=nums[i];
            }
            else if(nums[i]!=lastSmaller)
            {
                count=1;
                lastSmaller=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}