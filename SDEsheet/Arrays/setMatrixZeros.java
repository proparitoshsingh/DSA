class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        HashMap<Integer, Boolean> rowZeros = new HashMap<>();
        HashMap<Integer, Boolean> colZeros = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowZeros.put(i, true);
                    colZeros.put(j, true);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (rowZeros.containsKey(i)) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (colZeros.containsKey(j)) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}