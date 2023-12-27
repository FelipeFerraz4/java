package atividade;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] agrs) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type a number: ");
		int number = scanner.nextInt();
		int divisores = 0;
		
		for(int i = number; i > 0; i--) {
			if (number % i == 0) {
				divisores++;
			}
		}
		
		if (divisores == 2) {
			System.out.printf("O %d e um numero primo.\n", number);
		}
		else{
			System.out.printf("O %d nao e um numero primo.\n", number);
		}
		
		scanner.close();
	}
}
