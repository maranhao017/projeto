package pack2;

import java.util.Scanner;
import java.util.Arrays;

public class ClasseArrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//a
		int vetA[]= new int[1];
		Arrays.fill(vetA, 1);
		
		int vetB[] = new int[3];
		//b
		System.out.println("Informe números para o vetor B: ");
		for(int cont=0; cont<(vetB.length);cont++) {
			vetB[cont]= scan.nextInt();
		}
		//c
		Arrays.sort(vetB);
		//d
		vetA = Arrays.copyOf(vetB, 3);
		
		System.out.println("Mostrando vetor A: ");
		//e
		for (int cont : vetA) {
			System.out.println(Arrays.toString(vetA));
		}
		
		System.out.println("");
		
		System.out.println("Mostrando vetor B: ");
	
	
}
