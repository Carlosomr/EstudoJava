import java.util.ArrayList;
import java.util.List;

public class EstruturadeDados {
    public static void main(String[] args) {
        //lista do tipo String
        List<String> nomes = new ArrayList<>();
        // a função 'add' serve para inserir dados na lista.
        nomes.add("Dani");
        nomes.add("Carlos");
        nomes.add("Elias");
        //0
        //1
        //2

        //System.out.println(nomes.get(0));
       // for(String nome : nomes){
         //  System.out.println("o nome é " + nome);

         nomes.forEach(nome -> System.out.println("O nome que apareceu é " + nome));
        }
    
    }

