
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

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
   public void imprimirReporte() {
        List<String> dias = new ArrayList<>(ventas.keySet());
        Collections.sort(dias);
        System.out.println("Reporte de ventas:");
        for (String dia : dias) {
            System.out.println(dia + ": " + ventas.get(dia));
        }
    }
}