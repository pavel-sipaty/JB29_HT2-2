package by.jb29.mod1.les04;

/*
 * ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] � ����� h. ���������
����������� � ���� �������, ������ ������� ������� � �������� ���������, ������ - ���������������
�������� �������:
 */


public class Task21 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double h = 0.5;
		
		a = 2;
		b = 5;
		System.out.print("�������� |" + "   �������� �������");
		System.out.println();
		System.out.println("         |");
		for(double x = a; x <= b; x += h) {
			double y = x - Math.sin(x);
			
			System.out.println(x + "      | " + "  " + y);
		}

	}

}
