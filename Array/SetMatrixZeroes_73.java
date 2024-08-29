package Array;
import java.util.*;
public class SetMatrixZeroes_73 {
    public void setZeroes(int[][] matrix) {
        int n = matrix[0].length;//rows
        int m = matrix.length;//col
        int[] rows = new int[n];
        int[] col = new int[m];
        Arrays.fill(rows,1);
        Arrays.fill(col,1);
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (matrix[i][j] == 0){
                    rows[i]=0;
                    col[j]=0;
                }
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (rows[i] == 0 || col[j]==0){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
