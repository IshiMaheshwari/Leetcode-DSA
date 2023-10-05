class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] ans=new int[2];
        ans[0]=ans[1]=-1;
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int num1=nums[i];
            int required=target-num1;
            if(hm.containsKey(required))
            {
            int num2=hm.get(required);
            ans[0]=i;
            ans[1]=num2;
            break;}
            hm.put(num1,i);
        }  
        return ans; 
    }
}