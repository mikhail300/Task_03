package by.htp.les07.matrix;

import by.htp.les07.tool.matrixTool;

// 8. ��� ���������� ������ nxm ���������. ����������, ������� ��� ����������� ����� 7 ����� ��������� �������.
public class Task_08 {
	public static void task() {
	System.out.println ("8. ��� ���������� ������ nxm ���������. ����������, ������� ��� ����������� ����� 7 ����� ���������\r\n" + 
			"�������.");
	int n;
	int m;
	n = 5;
	m = 7;
	int count;
	count = 0;
	int [][]a = new int [n][m];
	matrixTool.matrixInitRandom(a);
	matrixTool.matrixPrint(a);
	
	for(int i = 0 ; i < a.length ; i ++) {
		for (int j = 0 ; j < a[i].length ; j ++) {
			if (a[i][j] == 7) {
				count ++;
			}
		}
	}
	System.out.println ("����� 7 ����� ��������� ������� ����������� " + count + " ���.");
	System.out.println ();
	
	}
}
