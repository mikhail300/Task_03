package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 17. ���� ������������������ ����� �����. ���������� ����� ������������������, �������� �� �������� �� �����, ������� ����� min( , , , ).
public class Task_17 {
	public static void task () {
		System.out.println ("17. ���� ������������������ ����� �����. ���������� ����� ������������������, �������� �� �������� �� �����, ������� ����� min( , , , )");
		int n;
		n = 15;
		
		int[]a = new int [n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		int min;
		min = a[0];
		for (int i = 0; i < a.length ; i ++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		for (int i = 0; i < a.length ; i ++) {
			if (min == a[i]) {
				n--;
			}
		}
		//n --;
		System.out.println ("Min = " + min);
		System.out.println ("����� ������ �� " + n + " ���������.");
		int[]b = new int[n];
		for (int i = 0, j = 0; i < a.length; i++ ) {
			if (a[i] != min) {
				b[j] = a[i];
				j++;
			}
		}
		massTool.printMasInt(b);
		System.out.println ();
	}
}
