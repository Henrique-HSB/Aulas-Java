package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

class LerNumeroConsoleComScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        try {
            int numero = scanner.nextInt();
            System.out.print("O valor informado foi " + numero);
        } catch (InputMismatchException e) {
            System.out.print("O valor informado não é um número!");
        }
    }

}