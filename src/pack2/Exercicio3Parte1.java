package pack2;

import java.util.Scanner;
import java.math.*;

public class Exercicio3Parte1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Informe a altura que desejamos atingir na parede: ");
		int alturaParede = scan.nextInt();
		
		System.out.println("Informe a altura da escada: ");
		int alturaEscada = scan.nextInt();
		
		if (alturaParede >= alturaEscada) {
			System.out.println("Não é possível pendurar o quadro!");
		} else {
			double distancia = Math.sqrt (Math.pow(alturaEscada, 2) - Math.pow(alturaParede, 2));
			System.out.format("A distância da parede que a escada deve estar é: %.2f metros.", distancia);
		}

		scan.close();
	}

}
