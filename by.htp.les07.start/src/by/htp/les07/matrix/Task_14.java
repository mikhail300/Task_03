package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 14. ������������ ���������� ������� ������� n �� ��������� �������(n - ������):
public class Task_14 {
	public static void task() {
		System.out.println ("14. ������������ ���������� ������� ������� n �� ��������� �������(n - ������):");
		int n;
		n = 8;
		int[][]a = new int [n][n];
		matrixTool.matrixPrint(a);
		System.out.println ();
		for (int i = 0 ; i < a.length ; i ++) {
			a[i][-1 * i + a.length -1] = i + 1;
		}
		matrixTool.matrixPrint(a);
	}
}
