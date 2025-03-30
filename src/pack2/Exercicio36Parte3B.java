package pack2;

import java.util.Scanner;

public class Exercicio36Parte3B {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = scan.nextInt();
		
		System.out.println("Digite outro número: ");
		double n2 = scan.nextDouble();
	
		contagem(0, n1);
		
		double media = media(n1,n2);
		System.out.println(media);
		
		if ((n1 % 2) == 1) {
			int n3 = impar();
			int n4 = impar();
			maior(n3, n4);
		}
		
		scan.close();
		
	}

	public static void contagem (int x, int n1) {
	
		for ( ; x < n1; x++) {
			System.out.println(x + " ");
		}
	}

	public static double media (int n1, double n2) {
		
		double media = (double) (n1 + n2) / 2;
		return media;
		
	}
	
	public static int impar () {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Seu n1 é ímpar, digite mais 1 número: ");
		int n = scan.nextInt();
		return n;
	}
	
	public static void maior(int n3, int n4) {
		
		if (n3 > n4) {
			System.out.format("%d é maior que %d", n3, n4);
		} else if (n3 < n4) {
			System.out.format("%d é menor que %d", n3, n4);
		} else {
			System.out.println("Os dois números são iguais");
		}
	}
}
