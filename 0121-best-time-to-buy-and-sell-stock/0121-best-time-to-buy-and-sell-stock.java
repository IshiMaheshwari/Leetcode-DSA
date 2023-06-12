class Solution {
    public int maxProfit(int[] prices) {
     int z;
     int min=prices[0];
     int max=0;
     for(int i=1;i<prices.length;i++)
     {
         if(prices[i]<min) min=prices[i];
         else
         {
             z=prices[i]-min;
             if(z>max) max=z;
         }
     }   
       return max;
    }
}