package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 10. ���� ����� ����� �1 ,�2 ,..., �n . ������� �� ������ ������ �� �����, ��� ������� �i > i.
public class Task_10 {
	public static void task() {
		System.out.println ("10. ���� ����� ����� �1 ,�2 ,..., �n . ������� �� ������ ������ �� �����, ��� ������� �i > i.");
		int n;
		n = 15;
		
		int []a = new int [n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		
		for (int i =0; i < a.length ; i++) {
			if (a[i] > i) {
				System.out.println ("����� " + a[i] + " ������ " + i);
			}
		}
		System.out.println();
	}
}
