package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 6. ���� ������������������ ����� �1 ,�2 ,..., ��. ������� ���������� ����� �������� ���, ���������� ��� ��� �����.
public class Task_06 {
	public static void task () {
		System.out.println ("6. ���� ������������������ ����� �1 ,�2 ,..., ��. ������� ���������� ����� �������� ���, ���������� ��� ��� �����.");
		int n;
		n = 15;
		
		int [] a = new int [n];
		
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		
		int max;
		int min;
		max = a[0];
		min = a[0];
		for (int i = 1; i< a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}else if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println ("Max = " + max);
		System.out.println ("Min = " + min);
		
		System.out.println ("����� �������� ��� = " + (max-min));
		System.out.println ();
		
	}
}
