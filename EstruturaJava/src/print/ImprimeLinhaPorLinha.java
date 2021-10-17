package print;

public class ImprimeLinhaPorLinha {
    public static void main(String[] args) {
    
        String nome = "Academia PAN";
        
        // Para cada um dos caracteres da string nome, imprima o caractere:
        for (char letra : nome.toCharArray()) {
            System.out.println(letra);
        }
        
        
    }
}
