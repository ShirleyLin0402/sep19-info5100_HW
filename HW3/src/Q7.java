import java.util.ArrayList;

public class Q7 {
public int[] spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> reset = new ArrayList<Integer>();
        
        if (matrix.length == 0) {
        	int[] resetArr = new int[reset.size()];
        	for(int i = 0; i< resetArr.length; i++) {
        		resetArr[i] = reset.get(i);
			}
			return resetArr;
        }
        
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int j = colBegin; j <= colEnd; j ++) {
                reset.add(matrix[rowBegin][j]);
            }
            rowBegin++;
            for (int j = rowBegin; j <= rowEnd; j ++) {
                reset.add(matrix[j][colEnd]);
            }
            colEnd--;
            
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j --) {
                    reset.add(matrix[rowEnd][j]);
                }
            }
            rowEnd--;
            
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j --) {
                    reset.add(matrix[j][colBegin]);
                }
            }
            colBegin ++;
        }
        
        int[] resetArr = new int[reset.size()];
    	for(int i = 0; i< resetArr.length; i++) {
    		resetArr[i] = reset.get(i);
		}
		return resetArr;
    }

}
