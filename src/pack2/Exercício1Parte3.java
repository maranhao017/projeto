package pack2;

import java.util.Calendar;

public class Exercício1Parte3 {

	public static void main(String[] args) {
		
		Calendar data = Calendar.getInstance();
		
		int dia = data.get(Calendar.DAY_OF_MONTH - 1);
		int mes = data.get(Calendar.MONTH);
		int ano = data.get(Calendar.YEAR);
		
		System.out.print("A data de hoje é: ");
		System.out.printf("%d de ", dia);
		System.out.print(mes(mes));
		System.out.printf(" de %d", ano);
	}

	public static String mes(int mes) {
		return switch(mes) {
		case 0 -> "Janeiro";
		case 1 -> "Fevereiro";
		case 2 -> "Março";
		case 3 -> "Abril";
		case 4 -> "Maio";
		case 5 -> "Junho";
		case 6 -> "Julho";
		case 7 -> "Agosto";
		case 8 -> "Setembro";
		default -> "Inválido";
		};
	}
	
}
