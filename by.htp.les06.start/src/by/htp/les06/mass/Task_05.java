package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 5. ���� ������������������ ����������� ����� �1 , �2 ,..., ��. ������� ������ �� ������ ����� ���� ������������������.
// ���� ����� ����� ���, �� ������� ��������� �� ���� �����.
public class Task_05 {
	public static void task() {
		System.out.println ("5. ���� ������������������ ����������� ����� �1 , �2 ,..., ��. ������� ������ �� ������ ����� ���� ������������������.");
		System.out.println ("���� ����� ����� ���, �� ������� ��������� �� ���� �����.");
		int n;
		n = 4;

		int [] a = new int [n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		
		int countEven;
		countEven = 0;
		for (int i = 0; i < a.length; i++) {
			if ((a[i]%2) == 0) {
				countEven ++;
			}
		}
		
		if (countEven == 0) {
			System.out.println ("������ ����� � ������� ���.");
		}else {
			int count;
			count = 0;
			int[] newMass = new int[countEven];
			for (int i = 0; i < a.length; i++) {
				if ((a[i]%2) == 0) {
					newMass[count] = a[i];
					count++;
				}
			}
			System.out.println("������������������ ������ �����");
			massTool.printMasInt(newMass);
			System.out.println();
		}
	}
}
