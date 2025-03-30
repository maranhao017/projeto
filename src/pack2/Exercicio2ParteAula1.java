package pack2;

import java.util.Scanner;

public class Exercicio2ParteAula1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a altura entre os 2 andares: ");
		int altura = scan.nextInt();
		
		System.out.println("Informe a quantidade de degraus: ");
		int qtdDegraus = scan.nextInt();
		
		float alturaCM = (float) altura * 100;
		
		float alturaDegrau = (float) alturaCM / qtdDegraus;
		
		System.out.format("A Altura de cada degrau é: %.2f cm.", alturaDegrau);
		
	}

}
