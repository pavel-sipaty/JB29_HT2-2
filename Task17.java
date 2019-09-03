package by.jb29.mod1.les04;

//ƒаны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)


public class Task17 {

	public static void main(String[] args) {
		
		int a;
		int n;
		
		a = 3;
		
		int multi = 1;
		
		for(n = 1; n <= 3; n++) {
			
			int sum = a + n;
			multi = multi * sum;
						
		}
		
		int posled = a * multi;
		
		System.out.println(posled);

	}

}
