class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(cnt1==0 && ele2!=nums[i])
            {
                cnt1=1;
                ele1=nums[i];
            }
            else if(cnt2==0 && ele1!=nums[i])
            {
                cnt2=1;
                ele2=nums[i];
            }
            else if(ele1==nums[i]) cnt1++;
            else if(ele2==nums[i]) cnt2++;
            else
            {
                cnt1--;cnt2--;
            }
        }
        int mini=(n/3)+1;
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(ele1==nums[i]) cnt1++;
            if(ele2==nums[i]) cnt2++;
        }
        ArrayList<Integer> al=new ArrayList<>();
        if(cnt1>=mini) al.add(ele1);
        if(cnt2>=mini) al.add(ele2);
        return al;
    }
}