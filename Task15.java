package by.jb29.mod1.les04;

//Вычислить : 1+2+4+8+...+ 2 в 10 степени.


public class Task15 {

	public static void main(String[] args) {
		
		int a, i, ii;
		
		i = 0;
		ii = 10;
		a = 2;
		
		int sum = 0;
		
		
		for(; i <= ii; i++) {
		
			sum = sum + (int) Math.pow(a, i);
			
			
		}
		
		System.out.println(sum);

	}

}
