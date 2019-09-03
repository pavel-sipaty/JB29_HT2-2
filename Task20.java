package by.jb29.mod1.les04;

/*
 * Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
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
		System.out.printf("Сумма членов равна: %.5f", sum);
		

	}

}
