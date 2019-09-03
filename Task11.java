package by.jb29.mod1.les04;

/*
 * Составить программу нахождения разности кубов первых двухсот чисел
 */


public class Task11 {

	public static void main(String[] args) {
		
		long a;
		long b;
		long c;
		
		a = 2;  //первое число
		b = a + 199; //последнее число
		c = a + 1; //второе число
		
		long sum;
		sum = 0;
		
		long raznost;
		
		for(long x = c; x <= b; x++) {
			sum = sum + (long) Math.pow(x, 3);
			
		}
		
		raznost = a - sum;
		System.out.println("Разность кубов первых двухсот чисел: " + raznost);

	}

}
