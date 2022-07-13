import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DatasEmJava {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();
        String hojeFormatado = DateFormat.getInstance().format(hoje.getTime());
        System.out.println(hojeFormatado);
        System.out.println(Locale.getDefault());
    }
}
