package exercicio4;

            /*
Imprima os números que vão de 1 até 10 utilizando o laço de repetição (do - while)
             */

public class DoWhile {
    public static void main(String[] args) {
        int contador = 1;
        do {
            System.out.println(contador++);
        } while(contador <= 10);
    }
}
