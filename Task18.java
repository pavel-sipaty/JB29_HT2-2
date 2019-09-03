package by.jb29.mod1.les04;

/*Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
*/

public class Task18 {

	public static void main(String[] args) {
		
		double e = 0.02;
		
		//System.out.println(e);
		
		double an;
		double sum = 0;
		
		for(double n = 1; n <= 100; n++) {
			an = Math.abs((Math.pow(-1, n-1) / n));
			
			while(an >= e) {
				sum = sum + an;
				System.out.println(sum);
				break;
			}
		}
		System.out.printf("%.5f", sum);

	}

}
