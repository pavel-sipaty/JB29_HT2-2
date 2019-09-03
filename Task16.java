package by.jb29.mod1.les04;

//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).


public class Task16 {

	public static void main(String[] args) {
		
		int sum;
		sum = 0;
		
		int multi;
		multi = 1;
		
		for(int i = 1; i <= 10; i++) {
			
			sum = sum + i;
			
		}
		multi = multi * sum;
		
		System.out.println(multi);

	}

}
