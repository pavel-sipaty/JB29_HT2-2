package by.jb29.mod1.les04;


/*С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100
включительно.
*/


public class Task04 {

	public static void main(String[] args) {

		int a;
		int b;
		
		a = 2;
		b = 100;
		
		while(a <= b) {
			int x = a;
			System.out.println(x);
			a = a + 2;
		}
		System.out.println("Готово.");

	}

}
