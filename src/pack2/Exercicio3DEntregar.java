package pack2;

public class Exercicio3DEntregar {

	public static void main(String[] args) {

		double faturamentoA = 500000;
		double taxaA = 0.08;
		
		double faturamentoB = 1200000;
		double taxaB = 0.04;
		
		int anos = 0;
		
		while (faturamentoA <= faturamentoB && anos <=50) {
		
			faturamentoA = crescimentoA (faturamentoA, taxaA);
			faturamentoB = crescimentoB (faturamentoB, taxaB);
			mostraFaturamentoAnual(faturamentoA, faturamentoB, anos);
			anos++;
		
		}
		
		if (faturamentoA > faturamentoB)
			System.out.println("A Empresa A ultrapassou a Empresa B em " + anos + " anos.");
		else 
			System.out.println("Passaram-se " + anos + " anos e a Empresa A nao ultrapassou a Empresa B");
		
	}
	
	public static double crescimentoA (double faturamentoA, double taxaA) {
		double crescimentoA = (faturamentoA * taxaA) + faturamentoA;
		return crescimentoA;
	}
	
	public static double crescimentoB (double faturamentoB, double taxaB) {
		double crescimentoB = (faturamentoB * taxaB) + faturamentoB;
		return crescimentoB;
		
	}
	
	public static void mostraFaturamentoAnual (double faturamentoA, double faturamentoB, int anos) {
		
		System.out.printf("Ano - %d --- Empresa A - %.2f --- Empresa B - %.2f\n", anos, faturamentoA, faturamentoB);
		
	}

}