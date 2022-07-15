import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DiferencaEntreDatas {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date primeiraData = sdf.parse("01/02/2022");
        Date segundaData = sdf.parse("01/03/2022");

         long res = Math.abs(primeiraData.getTime() - segundaData.getTime());
         long diff = TimeUnit.DAYS.convert(res, TimeUnit.MILLISECONDS);
         System.out.println(diff);

         diferencaDataJava8ComTempo();

    }

    public static void diferencaDataJava8(){
        LocalDate data1 = LocalDate.of(2019, 04, 01);
        LocalDate data2 = LocalDate.of(2019, 05, 19);
        Period periodo = Period.between(data1, data2);
        int dias = periodo.getDays();
        int meses = periodo.getMonths();

        System.out.println("Dias: " + dias);
        System.out.println("Meses: " + meses);
    }

    public static void diferencaDataJava8ComTempo(){
        LocalTime tempo1 = LocalTime.of(8, 30);
        LocalTime tempo2 = LocalTime.of(9, 40);
        Duration duracao = Duration.between(tempo1, tempo2);

        long diff = duracao.toHours();

        System.out.println(diff);
    }
}


