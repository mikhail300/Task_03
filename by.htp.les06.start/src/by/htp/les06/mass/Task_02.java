package by.htp.les06.mass;

import by.htp.les06.view.massTool;

// 2. � ������������� ������������������ ���� ������� ��������. ������� ������ �� ������� ���� ���������.
public class Task_02 {
	public static void task() {
		System.out.println ("2. � ������������� ������������������ ���� ������� ��������. ������� ������ �� ������� ���� ���������.");
		int n;
		n = 150;
		System.out.println ("������ �� " + n + " ���������");
		int[] a = new int[n];
		massTool.initMasInt(a);
		massTool.printMasInt(a);
		
		int lengthNewMass;
		lengthNewMass = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				lengthNewMass++;
				System.out.println ("������� " + i + " = 0");
			}
		}
		
		int[] newMass = new int[lengthNewMass];
		
		int newMassI;
		newMassI = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				newMass[newMassI] = i;
				newMassI++;
			}
		}
		massTool.printMasInt(newMass);
		System.out.println();
	}
}
