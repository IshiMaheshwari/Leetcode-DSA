class Solution {
    public String reverseWords(String s) {
       
        String m[]=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<m.length;i++)
        {
           ans.append(new StringBuilder(m[i]).reverse());
            if(i!=m.length-1)
            {
                ans.append(" ");
            }
        } 
      return ans.toString();
    }
}