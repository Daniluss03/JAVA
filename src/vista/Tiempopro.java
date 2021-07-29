package vista;

/**
 *
 * @author danilus
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Tiempopro {

    Calendar fecha = new GregorianCalendar();

    String año = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH));
    String dia = Integer.toString(fecha.get(Calendar.DATE));

    String fechacomp = año + "-" + mes + "-" + dia;

    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(fecha.get(Calendar.MINUTE));

    String horacomp = hora + ":" + minuto;
}
