package by.jb29.mod1.les04;

//Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.


public class Task14 {

	public static void main(String[] args) {
		
		double a;
		a = 1;
		
		double n;
		n = 100;
		
		double posled = 0;
		
		for(double x = a; x <= n; x++) {
			
			posled = posled + 1 / x;
		}
		
		System.out.printf("%.3f", posled);

	}

}
