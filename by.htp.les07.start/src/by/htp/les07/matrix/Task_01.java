package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 1. C������ ������� 3 x 4, ��������� �� ������� 0 � 1 ���, ����� � ����� ������ ���� ����� ���� �������, � ������� �� �����.
public class Task_01 {
	public static void task () {
		System.out.println ("1. C������ ������� 3 x 4, ��������� �� ������� 0 � 1 ���, ����� � ����� ������ ���� ����� ���� �������, �\r\n" + 
				"������� �� �����.");
		int[][]a = {{1,0,0,0}, {0,1,0,0},{0,0,1,0}};
		
		matrixTool.matrixPrint(a);
		System.out.println ();
		
	}
}
