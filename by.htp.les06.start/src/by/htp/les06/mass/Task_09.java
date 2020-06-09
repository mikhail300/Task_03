package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 9. ���� �������������� ����� �1 ,�2 ,..., �n . �������� ������� ���������� � ���������� ��������.
public class Task_09 {
	public static void task () {
		System.out.println ("9. ���� �������������� ����� �1 ,�2 ,..., �n . �������� ������� ���������� � ���������� ��������.");
		int n;
		n = 15;
		int max;
		int min;
		max = 0;
		min = 0;
		
		double[]a = new double[n];
		massTool.initMasDouble(a);
		massTool.printMasDouble(a);
		
		for (int i = 1; i < a.length ; i++) {
			if (a[max] < a[i]) {
				max = i;
			}else if (a[min] > a[i]) {
				min = i;
			}
		}
		
		System.out.println ("������ ������������� ����� " + a[max] + " ����� " + max);
		System.out.println ("������ ������������ ����� " + a[min] + " ����� " + min);
		
		double temp;
		temp = a[max];
		a[max] = a[min];
		a[min] = temp;
		massTool.printMasDouble(a);
		System.out.println ();
	}
}
