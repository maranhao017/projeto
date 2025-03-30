package pack2;

import java.util.Scanner;

public class Exercicio63Parte4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite três números: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		maior(num1, num2, num3);
		//tabela1(num1, num2, num3);
		tabela2(num1, num2, num3);
	}

	private static void maior(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.format("O número maior é %d.\n", a);
		} else if (b > c) {
			System.out.format("O número maior é %d.\n", b);
		} else {
			System.out.format("O número maior é %d.\n", c);
		}
	}

	private static void tabela1(int a, int b, int c) {

		int col, lin;

		if (a > b && a > c) {

			for (lin = 1; lin <= a; lin++) {
				for (col = 1; col <= lin; col++) {
					System.out.print(lin * col + "\t");
				}
				System.out.println();
			}

		} else if (b > c) {

			for (lin = 1; lin <= b; lin++) {
				for (col = 1; col <= lin; col++) {
					System.out.print(lin * col + "\t");
				}
				System.out.println();
			}
		} else {

			for (lin = 1; lin <= c; lin++) {
				for (col = 1; col <= lin; col++) {
					System.out.print(lin * col + "\t");
				}
				System.out.println();
			}
		}
	}
	
	private static void tabela2 (int a, int b, int c) {
		int col, lin; 
		
		if (a > b && a > c) {

			for (lin = a; lin >= 1; lin--) {
				for (col = 1; col <= lin; col++) {
					System.out.print(lin * col + "\t");
				}
				System.out.println();
			}

		} else if (b > c) {

			for (lin = b; lin >= 1; lin--) {
				for (col = 1; col <= lin; col++) {
					System.out.print(lin * col + "\t");
				}
				System.out.println();
			}
		} else {

			for (lin = c; lin >= 1; lin--) {
				for (col = 1; col <= lin; col++) {
					System.out.print(lin * col + "\t");
				}
				System.out.println();
			}
		}
		
	}
	
}
