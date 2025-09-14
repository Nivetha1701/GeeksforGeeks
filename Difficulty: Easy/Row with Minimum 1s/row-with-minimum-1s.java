class Solution {
    int minRow(int mat[][]) {
        // code here
        int min=Integer.MAX_VALUE;
        int row=0;
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            if(count<min){
                min=count;
                row=i;
            }
        }
        return row+1;
    }
};