package by.jb29.mod1.les04;

/*
 *  С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от
1 до 99 включительно.
 */


public class Task05 {

	public static void main(String[] args) {

		int a;
		int b;
		
		a = 1;
		b = 99;
		int sum = 0;
		
		while(a <= b) {
			int x = a;
			sum = sum + x;
			a = a + 2;
						
		}
		
		System.out.println(sum);
		System.out.println("Готово.");

	}

}
