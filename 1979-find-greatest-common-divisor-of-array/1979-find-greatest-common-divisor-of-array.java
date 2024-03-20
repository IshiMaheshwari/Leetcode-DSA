class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int a=nums[0];
        int b=nums[n-1];
        return gcd(a,b);
    }
    public int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
}