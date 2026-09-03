class Solution {
    //input: n * m = O(n^2)
    
    //time :O(n^4), n = number of rows and cols in mat to loop through
    //space:O(n^2), n = number of rows and cols in grid 

    public int[][] matrixBlockSum(int[][] mat, int k) {
        // i - k <= row <= i + k
        // j - k <= col <= j + k

        int row = mat.length;
        int col = mat[0].length;

        int[][] grid = new int[row][col];

        // first time loop
        for(int i =0; i < mat.length; i++) {
            for(int j =0; j < mat[i].length; j++) {
                int sum = 0;

                // second time loop
                for(int r = i - k; r <= i + k; r++) {
                    for(int c = j - k; c <= j + k; c++) {
                        
                        //check bounds
                        if(r >= 0 && r < row && c >= 0 && c < col) {
                            sum += mat[r][c];
                        }
                    }
                }

                grid[i][j] = sum;
            }
        }

        return grid;
    }
}