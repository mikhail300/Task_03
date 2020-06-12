package by.htp.les07.tool;

public class matrixTool {
	public static void matrixPrint (int [][] matrix) {
		for (int i = 0 ; i < matrix.length ; i ++) {
			for (int j = 0 ; j < matrix[i].length ; j ++) {
				System.out.printf ("%3d", matrix[i][j]);
				
			}
			System.out.println();
		}
	}

	public static void matrixInitRandom (int matrix[][]) {
		for (int i = 0 ; i < matrix.length ; i ++) {
			for (int j = 0 ; j < matrix[i].length ; j ++) {
				matrix [i][j] = (int) (Math.random() * 20 - 10);
			}
		}
	}
}
