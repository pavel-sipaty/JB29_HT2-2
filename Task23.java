package by.jb29.mod1.les04;


/*
 * ��������� ��������� ��� ���������� �������� ������� F(x) �� ������� [�, b] � ����� h. ���������
����������� � ���� �������, ������ ������� ������� � �������� ���������, ������ - ���������������
�������� �������:
 */


public class Task23 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double h;
		
		a = 1;
		b = 5;
		h = 0.5;
		
		System.out.print("�������� |" + "   �������� �������");
		System.out.println();
		System.out.println("         |");
		
		for(double x = a; x <= b; x += h) {
			
			double y = 1.0 / Math.tan(x / 3) + (1.0 / 2) * Math.sin(x);
			
			System.out.println(x + "      | " + "  " + y);
		}

	}

}
