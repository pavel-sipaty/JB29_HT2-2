package by.jb29.mod1.les04;

/*���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, ������ ������� ������ ��� �����
��������� �. ����� ���� ���� ����� ���:
*/

public class Task19 {

	public static void main(String[] args) {
		
		double e = 0.01;
		
		double an;
		
		double sum = 0;
		
		for(double n = 2; n <= 10; n++) {
			
			an = Math.abs(1/Math.pow(2, n) + 1/Math.pow(3, n));
			
			while(an >= e) {
				sum = sum + an;
				System.out.println(sum);
				break;
			}
						
		}
		System.out.println("----------");
		System.out.printf("����� ������ ����: %.4f", sum);

	}

}
