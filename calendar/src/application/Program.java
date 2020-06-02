package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date d = Date.from(Instant.parse("2020-05-29T16:34:07Z"));
		
		System.out.println("-----------------------------------");
		System.out.println("Data inicial: " + sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		cal.add(Calendar.HOUR_OF_DAY, 3);
		d = cal.getTime();
		
		System.out.println("-----------------------------------");
		System.out.println("Data + 3 horas: " + sdf.format(d));
		System.out.println("-----------------------------------");
		
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutos: " + minutes);
		System.out.println("-----------------------------------");
		
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Mês: " + month);
		System.out.println("-----------------------------------");
	}

}
