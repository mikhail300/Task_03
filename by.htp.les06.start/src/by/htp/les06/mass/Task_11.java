package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 11. ���� ����������� ����� �1 ,�2 ,..., �n . ������� �� �� ���, � ������� ������� �� ������� �� � ����� L (0 < L < �-1).
public class Task_11 {
	public static void task() {
		System.out.println ("11. ���� ����������� ����� �1 ,�2 ,..., �n . ������� �� �� ���, � ������� ������� �� ������� �� � ����� L (0 < L < �-1).");
		int n;
		n = 15;
		int m;
		m = 2;
		int l;
		l = 1;
		
		System.out.println ("M = " + m);
		System.out.println ("L = " + l);
		
		int []a = new int [n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		
		for (int i = 0; i < a.length ; i ++) {
			if ((a[i]%m) == l) {
				System.out.println (a[i] + " % " + m + " = " +(a[i]%m) + " = " + l );
			}
		}
	}
}
