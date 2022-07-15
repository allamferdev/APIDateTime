import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class novaAPI {
    public static void main(String[] args) {
        // data dd MM yyyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println(agora.minusYears(1));
        System.out.println(agora.getDayOfWeek());

        LocalTime horaAtual = LocalTime.now();
        System.out.println(horaAtual.plusHours(1));

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds();

        for(String item : fusos){
            System.out.println(item);
        }
    }
}
