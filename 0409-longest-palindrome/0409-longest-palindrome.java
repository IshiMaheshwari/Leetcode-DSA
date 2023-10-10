class Solution {
    public int longestPalindrome(String s) {
       HashSet<Character> hs=new HashSet<>();
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++)
        {
          if(hs.contains(s.charAt(i)))
          {
              hs.remove(s.charAt(i));
              count++;
          }
           else 
           {
                hs.add(s.charAt(i));
           }
        }
        if(!hs.isEmpty()) return 2*count+1;
        return 2*count;
    }
}