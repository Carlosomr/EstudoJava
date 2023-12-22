import java.util.HashSet;
import java.util.Set;

public class ColecoesHashset {
    
    public static void main(String[] args) {
        Set<Integer> numeros= new HashSet<>();
        numeros.add(10);
        numeros.add(11);
        numeros.add(12);

        numeros.remove(11);

        System.out.println(numeros);
        
    }
}
