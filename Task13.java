package by.jb29.mod1.les04;

//��������� ������� �������� ������� y = 5 - x2/2 �� ������� [-5; 5] � ����� 0.5.


public class Task13 {

	public static void main(String[] args) {
		
		double a;
		double b;
		a = -5;
		b = 5;
		
		double y;
		double h = 0.5;
		
		for(double x = a; x <= b; x = x + h) {
			
			y = 5 - Math.pow(x, 2) / 2;
			
			System.out.print(" | " + y);
		}
		
		
	}

}
