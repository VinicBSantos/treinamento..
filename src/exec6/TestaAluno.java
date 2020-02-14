package exec6;

import java.util.Calendar;
import javax.swing.JOptionPane;
import org.joda.time.DateTime;
import org.joda.time.Days;

/**
 * classe para contar dias 
 * @author vbsantos
 * @since 13/02/2020
 * @version 0.1
 */

public class TestaAluno {
	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		String dataCompleta = JOptionPane.showInputDialog("informe a data de nascimento");
		String data[] = dataCompleta.split("/");
		int ano = Integer.parseInt(data[2]);
		int mes = Integer.parseInt(data[1]);
		int dia = Integer.parseInt(data[0]);

		int anoc = cal.get(Calendar.YEAR);
		int mesc = cal.get(Calendar.MONTH)+1;
		int diac = cal.get(Calendar.DAY_OF_MONTH);

		DateTime dataInicial = new DateTime(ano, mes, dia, 0, 0);
		DateTime dataFinal = new DateTime(anoc, mesc, diac, 0, 0);

		int dias = Days.daysBetween(dataInicial, dataFinal).getDays();

		System.out.println(dias + "\n" + dias);

	}
}

/*
 * import java.util.Scanner;
 * 
 * public class TotalDias {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner scan = new Scanner(System.in); int ano = scan.nextInt(); int mes =
 * scan.nextInt(); int dias = scan.nextInt();
 * 
 * int anoA = 2020; int mesA = 02; int diasA = 11;
 * 
 * int anoB=((anoA-ano)*365); int mesB=((mesA-mes)*30); int diasB=(diasA-dias);
 * 
 * int iTotal = (anoB+mesB+diasB); String total = " "+iTotal; String idade
 * =" "+(iTotal/365);
 * 
 * System.out.println(total); System.out.println(idade);
 */
