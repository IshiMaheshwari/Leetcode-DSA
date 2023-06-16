class Solution {
    public void sortColors(int[] nums) {
        // Dutch National Flag Algorithm
        int low=0;
        int mid=0;
        int n=nums.length;
        int high=n-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
              int g=nums[mid];
              nums[mid]=nums[low];
              nums[low]=g;
              mid++;
              low++;
            }
            else if(nums[mid]==1)
            {
              mid++;
            }
            else
            {
               int g=nums[mid];
               nums[mid]=nums[high];
               nums[high]=g;
               high--;
            }

        }    
    }
}