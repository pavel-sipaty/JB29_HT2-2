package by.jb29.mod1.les04;

//��������� ��������� ���������� ������������ ��������� ������ ������� �����.


public class Task10 {

	public static void main(String[] args) {
		
		long a;
		long b;
		
		a = 1;
		b = a + 199;
		
		long proizv;
		proizv = 1;
		
		for(long x = a; x <= b; x++) {
			proizv = proizv * (long) Math.pow(x, 2);
		}
		System.out.println("������������ ��������� ������ ������� �����: " + proizv);

	}

}
