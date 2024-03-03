class NumArray {
    int[] t;

    public NumArray(int[] nums) {
        int size=nums.length;
        t=new int[size+1];
        for(int i=0;i<size;i++)
        {
            t[i+1]=t[i]+nums[i];
        }
        
    }
    
    public int sumRange(int left, int right) {
        return t[right+1]-t[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */