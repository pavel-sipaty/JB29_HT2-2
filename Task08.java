package by.jb29.mod1.les04;

/*
 * Вычислить значения функции на отрезке [а,b] c шагом h:
 */


public class Task08 {

	public static void main(String[] args) {

		int a;
		int b;
		int c;
		int h;
		int x;
		int y;
		
		a = -10;
		b = 90;
		h = 1;
		c = 3;
		
		
		for(x = a; x <= b; x = x + h) {
			if(x == 15) {
				y = (x + c) * 2;
			}else {
				y = (x - c) + 6;
			}
			System.out.println(y);

		}

	}
}	
