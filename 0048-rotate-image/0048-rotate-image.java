class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        // Step 1: Transpose the matrix
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int g=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=g;
            }
        }
        // Step 2: Reverse each row of the matrix
        for(int i=0;i<n;i++)
        {
            reverseArray(matrix[i],n);
        }
    }
    public void reverseArray(int arr[],int n)
    {
        int p1=0;
        int p2=n-1;
        while(p1<p2)
        {
            int g=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=g;
            p1++;
            p2--;
        }
    }
}