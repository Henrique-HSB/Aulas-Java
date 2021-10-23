package exercicio2;

import java.util.Locale;
import java.util.Scanner;

                        /*
     A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado,
     ficou de recuperação ou foi reprovado.
     A média de aprovação é >=7.0;
     a média de recuperação é >= 5.0 e < 7.0;
     e a média do reprovado é < 5.0
                         */

public class RunMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);


        int nota1, nota2, nota3;
        System.out.println("Nota 1:");
        nota1 = teclado.nextInt();
        System.out.println("Nota 2:");
        nota2 = teclado.nextInt();
        System.out.println("Nota 3:");
        nota3 = teclado.nextInt();
        MediaDoAluno media1 = new MediaDoAluno(nota1, nota2, nota3);

        System.out.println(media1);
    }

}
