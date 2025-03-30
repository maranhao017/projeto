package pack2;

import java.util.Scanner;

public class Exercicio1Parte1 {

	public static void main(String[] args) {
		
		Scanner area = new Scanner(System.in);
		
		System.out.println("Informe a altura: ");
		float altura = area.nextFloat();
		
		System.out.println("Informe a base menor: ");
		int baseMenor = area.nextInt();
		
		System.out.println("Informe a base maior: ");
		int baseMaior = area.nextInt();
		
		float areaTotal = (altura * (baseMenor + baseMaior)) / 2;
		
		System.out.format("Área total: %.2f metros", areaTotal);

	}

}
