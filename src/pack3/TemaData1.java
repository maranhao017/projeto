package pack3;

import java.util.Date;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Calendar;

public class TemaData1 {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale ("pt","BR"));
		
		DateFormat data = DateFormat.getDateInstance(DateFormat.FULL);
		
		Date hoje = new Date();
		
		Calendar horario = Calendar.getInstance();
		
		int hora = horario.get(Calendar.HOUR_OF_DAY);
		int minuto = horario.get(Calendar.MINUTE);
		
		mostraData(data, hoje, hora, minuto);
		
	}

	public static void mostraData (DateFormat data, Date hoje, int hora, int minuto) {
		System.out.println("Hoje é " + data.format(hoje) + " e agora sâo " + hora + " horas e " + minuto + " minutos");
	}
	
}
