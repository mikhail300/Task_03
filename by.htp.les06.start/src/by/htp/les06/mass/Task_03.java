package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 3. ���� ������������������ ����� ����� �1 �2,..., �n . ��������, ����� ����� ����������� ������ - ������������� ��� �������������.
public class Task_03 {
	public static void task() {
		System.out.println ("3. ���� ������������������ ����� ����� �1 �2,..., �n . ��������, ����� ����� ����������� ������ - ������������� ��� �������������.");
		int n;
		n = 10;
		int[] a = new int[n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				System.out.println ("������ ����������� ������������� ����� " + a[i] + " � �������� = " + i);
				break;
			}else if (a[i] > 0) {
				System.out.println ("������ ����������� ������������� ����� " + a[i]+ " � �������� = " + i);
				break;
			}
		}
		System.out.println();
	}
}
