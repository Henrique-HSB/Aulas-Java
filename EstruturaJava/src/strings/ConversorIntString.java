package strings;

public class ConversorIntString {
    public static void main(String[] args) {
    
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);

        String valor2 = "40.5";
        int idade2 = Integer.parseInt(valor2);
        System.out.println(idade2);
        float idade3 = Float.parseFloat(valor2);
        System.out.println(idade3);

    }
}

