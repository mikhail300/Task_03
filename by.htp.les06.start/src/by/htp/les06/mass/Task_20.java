package by.htp.les06.mass;

import by.htp.les06.view.massTool;

/* 20. ��� ������������� ������ � ����������� ��������� �. ����� ������, �������� �� ���� ������ ������ �������
(�������������� �������� ��������� ������). ����������. �������������� ������ �� ������������. */
public class Task_20 {
	public static void task() {
		System.out.println ("20. ��� ������������� ������ � ����������� ��������� �. ����� ������, �������� �� ���� ������ ������ �������\r\n" + 
				"(�������������� �������� ��������� ������). ����������. �������������� ������ �� ������������.");
		int n;
		n = 15;
		int []a = new int [n];
		
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		System.out.println();
		for (int i = 2, j = 1 ; i < a.length ; i +=2, j ++ ) {
			a[j] = a[i];
			a[i] = 0;
			if (i < a.length-1) {
				a[i+1] = 0;
			}
		}
		System.out.println ("��������� ����� ������.");
		massTool.printMasInt(a);
		
	}
}
