import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Samp{

     public static void main(String []args){
        Date dt = new Date();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(LocalDate.now().format(formatter));
        String dateString = "2024-04-10T14:30:00";
        LocalDateTime dateTime = LocalDateTime.parse(dateString);
        System.out.println(dateTime);     }
}
