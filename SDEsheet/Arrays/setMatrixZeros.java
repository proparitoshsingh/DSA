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

//event better approach that saves the extra space which is used in hashmap approach 


// class Solution {
//     public void setZeroes(int[][] matrix) {
//         boolean rowFlag = false, colFlag = false;
//         for (int i = 0; i < matrix.length; i++) {
//             if (matrix[i][0] == 0)
//                 colFlag = true;
//         }

//         for (int i = 0; i < matrix[0].length; i++) {
//             if (matrix[0][i] == 0)
//                 rowFlag = true;
//         }

//         for (int i = 1; i < matrix.length; i++) {
//             for (int j = 1; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == 0) {
//                     matrix[0][j] = 0;
//                     matrix[i][0] = 0;
//                 }
//             }
//         }

//         for (int i = 1; i < matrix[0].length; i++) {
//             if (matrix[0][i] == 0) {
//                 for (int j = 1; j < matrix.length; j++) {
//                     matrix[j][i] = 0;
//                 }
//             }
//         }

//         for (int i = 1; i < matrix.length; i++) {
//             if (matrix[i][0] == 0) {
//                 for (int j = 1; j < matrix[0].length; j++) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }

//         if (rowFlag) {
//             for (int i = 0; i < matrix[0].length; i++) {
//                 matrix[0][i] = 0;
//             }
//         }

//         if (colFlag) {
//             for (int i = 0; i < matrix.length; i++) {
//                 matrix[i][0] = 0;
//             }
//         }
//     }
// }
