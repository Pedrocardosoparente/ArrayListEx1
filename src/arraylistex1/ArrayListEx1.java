import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // Criação da ArrayList de Strings chamada estudantes
        ArrayList<String> estudantes = new ArrayList<>();
        
        // Adição dos estudantes à ArrayList
        estudantes.add("Amy");
        estudantes.add("Bob");
        estudantes.add("Cindy");
        estudantes.add("David");
        
        // Impressão dos elementos na ArrayList
        System.out.println("Elementos na ArrayList:");
        for (String estudante : estudantes) {
            System.out.println(estudante);
        }
        
        // Exibição do tamanho da ArrayList
        System.out.println("Tamanho da ArrayList: " + estudantes.size());
    }
}

//////////////////////////;