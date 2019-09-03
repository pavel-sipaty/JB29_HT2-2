package by.jb29.mod1.les04;

/*
 * Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте программу нахождения
произведения первых 10 членов этой последовательности.
 */

public class Task12 {

	public static void main(String[] args) {

		long i = 1;
		long ii = 10;
		long an = 1;
		
		long proizved = 1;
		 
		
		for(i = 1; i <= ii; i++) {
			
			//System.out.println(an);
			proizved = proizved * an;
			an = 6 + an;
					
		}
			
		//proizved = proizved * an;
		System.out.println(proizved);
			

	}

}
