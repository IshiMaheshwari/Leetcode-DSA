class Solution {
    public int lengthOfLIS(int[] nums) {
        int size=nums.length;
        int m[]=new int[size];
        int max=0;
        Arrays.fill(m,1);
        //int max=0;
        for(int f=1;f<size;f++)
        {
            for(int e=0;e<f;e++)
            {
                if(nums[e]<nums[f] && m[f]<m[e]+1) m[f]=m[e]+1;
            }
        }
        for(int i=0;i<size;i++)
        {
            if(m[i]>max) max=m[i];
        }
        return max;
    }
}