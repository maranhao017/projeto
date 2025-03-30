package pack3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class TemaData2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a data que deseja saber quanto tempo falta (OBS: pressione ENTER entre dia, mes e ano.");
		int dia = scan.nextInt();
		int mes = scan.nextInt();
		int ano = scan.nextInt();
		
		contaTempo(dia, mes, ano);
		
		scan.close();
		
	}

	public static void contaTempo (int dia, int mes, int ano) {
		
		LocalDate agora = LocalDate.now();
		LocalDate data = LocalDate.of(ano, mes, dia);
		
		
		Period periodo = Period.between(agora, data);
		
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("Faltam " + dias + " dia(s), " + meses + " mes(es) e " + anos + " ano(s).");
		
	}
	
}
