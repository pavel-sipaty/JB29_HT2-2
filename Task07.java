package by.jb29.mod1.les04;


//Вычислить значения функции на отрезке [а,b] c шагом h:


public class Task07 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int h;
		int x;
		int y;
		
		a = -10;
		b = 40;
		h = 1;
		
		
		
		for(x = a; x <= b; x = x + h) {
			if(x > 2) {
				y = x;
			}else {
				y = -x;
			}
			System.out.println(y);
			
		}

	}

}
