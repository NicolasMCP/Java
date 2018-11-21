package xyz.infodata.elementar.data.thread.safe;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Demostra o uso de LocalDate, LocalTime, Period e Duration.<br>
 * São thread-safe, quando trabalhar com thread você praticamente não se preocupa com elas.
 * @author Nicolas Ramos {@link nicolas@infodata.xyz}<br>
 * Java 11 (é precisso Java 8 ou superior)<br>
 * <b>Nota:</b> Se quiser usar o formato de 12 horas, substitua 'format(formato24H)' por 'format(formato12H)'.
 */
public class App {

	public static void main(String[] args) {
		
		LocalTime horaInicio = LocalTime.now();
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		DateTimeFormatter formato12H = DateTimeFormatter.ofPattern("hh:mm:ss a");
		
		DateTimeFormatter formato24H = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		LocalDate data = LocalDate.now();
		
		System.out.println("A Data de Hoje é: "+data.format(formatoData)+".");
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		LocalTime hora = LocalTime.now();
		
		System.out.println("Agora são: "+hora.format(formato24H)+" Horas."+System.lineSeparator());

		/*---------------------------------------------------------------------------------------------------------*/
		
		data = LocalDate.of(2019, 11, 22);
		
		System.out.println("Uma Data montada com 'of': "+data.format(formatoData)+"."+System.lineSeparator());
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		hora = LocalTime.of(23, 25, 51);
		
		System.out.println("Uma Hora montada: "+hora.format(formato24H)+" Horas."+System.lineSeparator());
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		data = LocalDate.parse("23/12/2020", formatoData);
		
		System.out.println("Uma Data montada com 'parse': "+data.format(formatoData)+"."+System.lineSeparator());
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		data = LocalDate.now();

		System.out.println("A Data de Hoje continúa sendo: "+data.format(formatoData)+".");
		
		data = data.plusMonths(1);
		
		System.out.println("Hoje + 1 mês, é: "+data.format(formatoData)+".");
		
		data = data.plusMonths(1);
		
		System.out.println("+ 1 mês, é: "+data.format(formatoData)+".");
		
		data = data.plusMonths(1);
		
		System.out.println("+ 1 mês, é: "+data.format(formatoData)+".");
		
		data = data.plusMonths(1);
		
		System.out.println("+ 1 mês, é: "+data.format(formatoData)+".");
		
		data = data.plusMonths(1);
		
		System.out.println("+ 1 mês, é: "+data.format(formatoData)+"."+System.lineSeparator());
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		data = data.minusMonths(5);
		
		System.out.println("- 5 meses, voltamos a data de hoje: "+data.format(formatoData)+"."+System.lineSeparator());
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		data = data.plusMonths(2).plusWeeks(2);
		
		System.out.println("+ 2 meses e 2 semanas, é: "+data.format(formatoData)+".");
		
		data = LocalDate.now();
		
		data = data.plusYears(1).plusMonths(1).plusWeeks(1).plusDays(3);
		
		System.out.println("Hoje + 1 ano, 1 mês, 1 semana, 3 dias, é: "+data.format(formatoData)+"."+System.lineSeparator());
		
		data = LocalDate.now();
		
		data = data.plusDays(30);
		
		System.out.println("Hoje + 30 dias, é: "+data.format(formatoData)+".");
		
		data = data.plusDays(30);
		
		System.out.println("+ 30 dias, é: "+data.format(formatoData)+".");
		
		data = data.plusDays(30);
		
		System.out.println("+ 30 dias, é: "+data.format(formatoData)+".");
		
		data = data.plusDays(30);
		
		System.out.println("+ 30 dias, é: "+data.format(formatoData)+"."+System.lineSeparator());
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		data = data.minusDays(120);
		
		System.out.println("- 120 dias, volta a ser: "+data.format(formatoData)+"... Hoje."+System.lineSeparator()+System.lineSeparator());
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		System.out.println("Podemos também definir um período");
		
		Period periodo = Period.of(0, 7, 15);
		
		data = data.plus(periodo);
		
		System.out.println("Após um período de 7 meses e 5 dias a data será: "+data.format(formatoData)+System.lineSeparator());
		
		/*---------------------------------------------------------------------------------------------------------*/
		
		LocalTime horaFim = LocalTime.now();
		
		Duration duracao = Duration.between(horaInicio, horaFim);
		
		int segundos = (duracao.getNano()/1000000000);
		
		int nano = duracao.getNano() - (segundos * 1000000000);
		
		int mili = (nano/1000000);
		
		nano -= (mili * 1000000);
		
		int micro = nano / 1000;
		
		System.out.println("Este programa demorou: "+segundos+" segundos, "+mili+" milisegundos, "+micro+" microsegundos");
		
		System.out.println("para ser executado.");
	}

}
