class Solution {
    public void reverse(int i,int j,int[] nums)
    {
        int g;
        while(i<j)
        {
            g=nums[i];
            nums[i]=nums[j];
            nums[j]=g;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ind=-1;
        
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                ind=i;
                break;
            }
        }
       if(ind==-1)
        {
            reverse(0,n-1,nums);
            
        }
       else
       { for(int i=n-1;i>ind;i--)
        {
            if(nums[i]>nums[ind])
            {
             int g=nums[i];
              nums[i]=nums[ind];
              nums[ind]=g;
              break;
            }
        }
       
        reverse(ind+1,n-1,nums);
       }
    }
    
}