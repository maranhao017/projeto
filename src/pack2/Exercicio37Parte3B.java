package pack2;

import java.util.Scanner;

public class Exercicio37Parte3B {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do seu depósito mensal: ");
		double deposito = scan.nextInt();
		
		System.out.println("Digite o montante desejado: ");
		double montante = scan.nextInt();
		
		double valorAcumulado = 0;
		
		int meses = 0;
		
		while (valorAcumulado < montante) {
			calcularJuros(deposito, valorAcumulado);
			meses++;
			System.out.printf("O valor acumulado no mês %d é de R$%.2f.", meses, valorAcumulado);
			
		}
		
	}

	public static double calcularJuros(double deposito, double valorAcumulado) {
		
		valorAcumulado = (double) (deposito * 0.5 / 100) + valorAcumulado + deposito;
		return valorAcumulado;
	}
}
