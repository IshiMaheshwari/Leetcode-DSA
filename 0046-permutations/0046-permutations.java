class Solution {
    public void recurePermute(int index,int[] nums,List<List<Integer>> ans)
    {
        List<Integer> ds=new ArrayList<>();
      if(index==nums.length)
      {
          for(int i=0;i<nums.length;i++)
          {
              ds.add(nums[i]);
          }
          ans.add(ds);
          return;
      }
        for(int i=index;i<nums.length;i++)
        {
            swap(index,i,nums);
            recurePermute(index+1,nums,ans);
            swap(index,i,nums);
        }
    }
    public void swap(int i,int j,int[] nums)
    {
        int g=nums[i];
        nums[i]=nums[j];
        nums[j]=g;
    }
    
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans=new ArrayList<>();
    recurePermute(0,nums,ans);
    return ans;    
    }
}