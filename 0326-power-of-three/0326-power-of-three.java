class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        if(n==1) return true;
        int num=n;
        while(num%3==0)
         {
             num=num/3;
         }
        if(num==1) return true;
        return false;
    }
}