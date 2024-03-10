class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    HashSet<Integer> set1=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
   HashSet<Integer> ans=new HashSet<>();
        for(int j=0;j<nums2.length;j++)
        {
            if(set1.contains(nums2[j]))
                ans.add(nums2[j]);
        }
        int size3=ans.size();
        int[] nums3=new int[size3];
        int index=0;
    for(int i:ans)
        {
            nums3[index++]=i;
        }
        return nums3;
    }
}