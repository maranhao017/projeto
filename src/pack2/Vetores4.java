package pack2;

public class Vetores4 {

	public static void main(String[] args) {
		
		int vetor[] = new int[100];
		int frequencia[] = new int[6];
		
		for (int cont = 0; cont < 100; cont++) {
			int numero = (int) (1 + Math.random() * 6);
			vetor[cont] = numero;
			frequencia[numero - 1]++;
		}
		
		for (int cont = 0; cont < 6; cont++) {
			System.out.format("O valor %d foi sorteado %d vezes.\n", cont + 1, frequencia[cont]);
		}
		
		int valorMaisSorteado = 1;
		int frequenciaM = 0;
		
		for (int cont = 0; cont < 6; cont++) {
			if (frequencia[cont] > frequenciaM) {
				frequenciaM = frequencia[cont];
				valorMaisSorteado = cont + 1;
			}
		}
	
		System.out.format("O valor mais sorteado foi %d com %d aparecimentos.", valorMaisSorteado, frequenciaM);
		
	}

	
}
