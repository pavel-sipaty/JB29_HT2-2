package by.jb29.mod1.les04;

import java.util.Scanner;

/*
 * �������� ���������, ��� ������������ ������ ����� ����� ������������� �����. � ���������
��������� ��� ����� �� 1 �� ���������� ������������� �����.
 */


public class Task06 {

	public static void main(String[] args) {
		
		
		System.out.println("������� ����� ������������� �����:");
		System.out.print(">>>");
		
		Scanner vvod = new Scanner(System.in);
		
		int chel = vvod.nextInt();
		int a = 1;
		int sum = 0;
		
		while(a <= chel) {
			int x = a;
			sum = sum + x;
			a++;
						
		}
		
		System.out.println(sum);
	}

}
