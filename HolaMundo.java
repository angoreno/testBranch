import java.time.LocalDateTime;
import java.time.ZoneId;

public class HolaMundo {
    void main() {
        System.out.println("Hola Mundo");
        System.out.println("Fecha y Hora: " + LocalDateTime.now());
        System.out.println("Lugar: " + ZoneId.systemDefault());
    }
}
