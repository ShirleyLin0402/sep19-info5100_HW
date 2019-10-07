
public class Q4{
	public static void main(String[] args) {
		int[][] A = { { 1, 0, 0 }, { -1, 0, 3} };
		int[][] B = { { 7, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };
		int[][] result = multiply(A, B);
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(" " + result[i][j]);
			}
			System.out.println();
		}

	}

	public static int[][] multiply(int[][] A, int[][] B) {
		int[][] result = new int[A.length][B[0].length];
		int x = A.length, y = A[0].length, z = B[0].length;
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (A[i][j] != 0) {
					for (int k = 0; k < z; k++) {
						result[i][j] += A[i][j] * B[j][k];
					}
				}
			}
		}
		return result;
	}
		  
}