class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       // Arrays.sort(nums2);
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int a=nums1[i];
            for(int j=0;j<nums2.length;j++)
            {
                if(a==nums2[j])
                {
                    for(int k=j;k<nums2.length;k++)
                    {
                        if(nums2[k]>a)
                        {
                            ans[i]=nums2[k];
                            break;
                        }
                        else
                        {
                            ans[i]=-1;
                        }
                    }
                    
                }
            }
        }
        return ans;
    }
}