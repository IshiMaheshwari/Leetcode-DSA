class Solution {
    public int longestConsecutive(int[] nums) {
       int n=nums.length;
        
       if(n==0) return 0;
        HashSet<Integer> hs=new HashSet<>();
        int longest=1;
        int count=0;
        for(int i=0;i<n;i++)
        {
         hs.add(nums[i]);
        }
        for(int it:hs)
        {
            if(!hs.contains(it-1))
          { 
            int x=it;
            count=1;
            while(hs.contains(x+1))
            {
                x=x+1;
                count=count+1;
            }
           }
            longest=Math.max(longest,count);
        }
    
    return longest;
    }
}