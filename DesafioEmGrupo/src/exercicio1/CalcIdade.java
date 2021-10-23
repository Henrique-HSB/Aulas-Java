package exercicio1;
                        /*
    Determine qual é a idade que o usuário faz no ano atual.
    Para isso solicite o ano de nascimento do usuário e o ano atual
                        */
import java.util.Locale;
import java.util.Scanner;

public class CalcIdade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int anoNascimento, anoAtual, idade;

        System.out.println("Informe o ano de nascimento:");
        anoNascimento = teclado.nextInt();
        System.out.println("Informe o ano atual:");
        anoAtual = teclado.nextInt();
        idade = anoAtual - anoNascimento;
        System.out.println(idade);
    }
}