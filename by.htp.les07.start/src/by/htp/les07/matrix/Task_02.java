package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 2. ������� � ������� �� ����� ������� 2 x 3, ����������� ���������� ������� �� [0, 9].
public class Task_02 {
	public static void task() {
		System.out.println ("2. ������� � ������� �� ����� ������� 2 x 3, ����������� ���������� ������� �� [0, 9].");
		int[][]a = new int[2][3];
		matrixTool.matrixInitRandom(a);
		matrixTool.matrixPrint(a);
	}
}
