package exercicio7;

import java.util.Locale;
import java.util.Scanner;

        /*
Lê 5 nomes e notas de uma turma, calcula e exibe a média das notas da turma
e em seguidaexibea relação de nomes cuja nota é superior a esta média
         */

public class MaiorQueMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);
        Aluno[] alunos = new Aluno[5];
        int soma = 0;
        float media = 0;

        for( int i = 0; i < alunos.length; i++) {
            System.out.println("Digite o nome:");
            String nome = teclado.nextLine();
            System.out.println("Digite a nota:");
            int nota = teclado.nextInt();
            alunos[i] = new Aluno(nome, nota);
            teclado.nextLine();
        }

        for (int i = 0; i < alunos.length; i++) {
            soma += alunos[i].getNota();
        }

        media =  (float)  soma / alunos.length;
        System.out.println("Média da sala: " + media);
        for (int i = 0; i < alunos.length; i++) {
            if (alunos[i].getNota() > media) {
                System.out.println(alunos[i].getNome());
            }
        }
    }

}
