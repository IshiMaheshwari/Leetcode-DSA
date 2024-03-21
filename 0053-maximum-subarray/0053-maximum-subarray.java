class Solution {
    public int maxSubArray(int[] nums) {
         int z=0;
        int sum=nums[0];
        int n=nums.length;
        
      for(int e=0;e<n;e++)
      {
             
              z=z+nums[e];
              if(z>sum) sum=z;
              if(z<0) z=0;
          
      }
        return sum;
    }
    
    
}