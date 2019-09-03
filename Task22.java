package by.jb29.mod1.les04;

/*
 * —оставить программу дл€ вычислени€ значений функции F(x) на отрезке [а, b] с шагом h. –езультат
представить в виде таблицы, первый столбец которой Ц значени€ аргумента, второй - соответствующие
значени€ функции:
 */

public class Task22 {

	public static void main(String[] args) {
		
		double a;
		double b;
		double h;
		
		a = 1;
		b = 5;
		h = 0.5;
		
		System.out.print("аргумент |" + "   значение функции");
		System.out.println();
		System.out.println("         |");
		
		for(double x = a; x <= b; x += h) {
			
			double y = Math.pow(Math.sin(x), 2);

			System.out.println(x + "      | " + "  " + y);
			
		}
		

	}

}
