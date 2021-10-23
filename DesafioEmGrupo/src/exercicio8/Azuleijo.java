package exercicio8;

import java.util.Locale;
import java.util.Scanner;

                            /*
Uma parede em formato retangular, cuja altura é hp (altura da parede)
e a largura lp (largura da parede) precisa ser coberta por azulejos
também retangulares. O azulejo retangular tem dimensões ha (altura do azulejo)
e la (largura do azulejo). Escreva um programa que leia as quatro medidas
hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas
são necessários para cobrir a parede dada.
                             */

public class Azuleijo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        float hp, ha, lp, la, areaParede, areaAzulejo, resultado;

        System.out.println("Informe a altura da parede:");
        hp = teclado.nextFloat();
        System.out.println("Informe a largura da parede:");
        lp = teclado.nextFloat();

        System.out.println("Informe a altura da azulejo:");
        ha = teclado.nextFloat();
        System.out.println("Informe a largura da azulejo:");
        la = teclado.nextFloat();

        areaParede = hp * lp;
        areaAzulejo = ha * la;
        resultado = areaParede / areaAzulejo;

        System.out.println("Para cobrir a parede serão necessários : " + Math.ceil(resultado) + " azuleijos");
    }
}
