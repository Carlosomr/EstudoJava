import java.util.HashMap;
import java.util.Map;

public class Colecoes {
    public static void main(String[] args) {
        
        Map<String, Integer> notas = new HashMap<>();
        notas.put("Dani", 9);
        notas.put("Vini", 10);
        notas.put("Carlos", 10);

        var nota = notas.get("Dani");
        System.out.println(nota);
    }
}
