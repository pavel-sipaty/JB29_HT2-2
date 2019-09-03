package by.jb29.mod1.les04;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число. А программа
суммирует все числа от 1 до введенного пользователем числа.
 */


public class Task06 {

	public static void main(String[] args) {
		
		
		System.out.println("Введите целое положительное число:");
		System.out.print(">>>");
		
		Scanner vvod = new Scanner(System.in);
		
		int chel = vvod.nextInt();
		int a = 1;
		int sum = 0;
		
		while(a <= chel) {
			int x = a;
			sum = sum + x;
			a++;
						
		}
		
		System.out.println(sum);
	}

}
