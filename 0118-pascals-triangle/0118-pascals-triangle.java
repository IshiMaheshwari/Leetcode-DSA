class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int col=1;col<=numRows;col++)
        {
            ans.add(generateRows(col));
        }
        return ans;
    }
    public List<Integer> generateRows(int row)
    {
        List<Integer> ansRow=new ArrayList<>();
        long ans=1;
        ansRow.add(1);
        for(int col=1;col<row;col++)
        {
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add((int)ans);
        }
        return ansRow;
    }
}