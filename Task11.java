package by.jb29.mod1.les04;

/*
 * ��������� ��������� ���������� �������� ����� ������ ������� �����
 */


public class Task11 {

	public static void main(String[] args) {
		
		long a;
		long b;
		long c;
		
		a = 2;  //������ �����
		b = a + 199; //��������� �����
		c = a + 1; //������ �����
		
		long sum;
		sum = 0;
		
		long raznost;
		
		for(long x = c; x <= b; x++) {
			sum = sum + (long) Math.pow(x, 3);
			
		}
		
		raznost = a - sum;
		System.out.println("�������� ����� ������ ������� �����: " + raznost);

	}

}
