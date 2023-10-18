import java.util.*;
class Solution {
    public boolean isValid(String s) {
        try
        {
    int n=s.length();
    Stack<Character> st=new Stack<>();
    int i=0;
        while(i<n)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[') st.push(s.charAt(i));
            else if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']')
            {
                if(s.charAt(i)==')' && st.peek()=='(' && st.size()>=1) st.pop();
                else if(s.charAt(i)=='}' && st.peek()=='{' && st.size()>=1) st.pop();
                else if(s.charAt(i)==']' && st.peek()=='[' && st.size()>=1) st.pop();
                else return false; 
            }
            i++;
        }
        if(!st.isEmpty()) return false;
       return true;
        }catch(EmptyStackException e)
        {
         return false;   
        }
         
    }
}