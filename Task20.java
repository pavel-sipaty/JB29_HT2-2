package by.jb29.mod1.les04;

/*
 * ���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� �����
��������� �. ����� ���� ���� ����� ���:
 */


public class Task20 {

	public static void main(String[] args) {
		
		double e = 0.00007;
		double an;
		double sum = 0;
		
		for(double n = -10; n <= 10; n++) {
			
			an = Math.abs(1 / ((3 * n - 2) * (3 * n + 1)));
			
			while(an >= e) {
				sum = sum + an;
				System.out.println(sum);
				break;
			}
			
		}
		System.out.println("-----------");
		System.out.printf("����� ������ �����: %.5f", sum);
		

	}

}
