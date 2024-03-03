class Solution {
    public int climbStairs(int n) {
        int e=1,f=1,g=1;
        while(g<=n)
        {
            f=f+e;
            e=f-e;
            g++;
        }
        return e;
    }
}