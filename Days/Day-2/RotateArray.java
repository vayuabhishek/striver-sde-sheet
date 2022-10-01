class Solution {
    public void rotate(int[][] matrix) {
        // Generally in rotate Question the key thing is to take transpose first.

        // After taking transpose
        // If they have told you to rotate in:

        // Anti Clockwise: Reverse the rows
        // Clockwise : Reverse the column

        // Always draw diagram for better clearity after taking transpose how my matrix
        // will look then you will easily able to figure out.

        // Matrix Transpose Result
        // 1 2 3 1 4 7 7 4 1
        // 4 5 6 2 5 8 8 5 2
        // 7 8 9 3 6 9 9 6 3

        // transpose matrix
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < r; c++) {
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        // rotate the column
        int fc = 0;
        int lc = matrix.length - 1;
        while (fc < lc) {
            for (int r = 0; r < matrix[0].length; r++) {
                int temp = matrix[r][fc];
                matrix[r][fc] = matrix[r][lc];
                matrix[r][lc] = temp;
            }
            fc++;
            lc--;
        }
    }
}

// Reference Himanshu Chikkara