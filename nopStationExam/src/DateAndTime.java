import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class DateAndTime {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}

