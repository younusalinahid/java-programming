import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class currenttime {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");

        String formatterdTime = time.format(formatter);

        System.out.println(formatterdTime);




    }
}
