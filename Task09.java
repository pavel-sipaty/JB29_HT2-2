package by.jb29.mod1.les04;

/*
 * Найти сумму квадратов первых ста чисел
 */


public class Task09 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double sum;
		
		sum = 0;
		
		a = 20;
		b = a + 99; 
		
		
		for(double x = a; x <= b; x++) {
			
			sum = sum + Math.pow(x, 2); 
			
			}
		
		System.out.println("Итоговая сумма: " + sum);
		}

	}
