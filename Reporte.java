
import java.util.HashMap;

public class Reporte {
    private HashMap<String, Integer> ventas;

    public Reporte() {
        ventas = new HashMap<>();
        ventas.put("Lunes", 120);
        ventas.put("Martes", 150);
        ventas.put("Miércoles", 90);
        ventas.put("Jueves", 200);
        ventas.put("Viernes", 175);
    }

    public HashMap<String, Integer> getVentas() {
        return ventas;
    }
}
