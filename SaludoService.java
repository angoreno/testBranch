import org.springframework.stereotype.Service;

@Service
public class SaludoService {

    public String obtenerMensaje() {
        return "mi primer endpoint";
    }
}
