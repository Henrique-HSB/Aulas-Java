package imc;

import pessoa.Pessoa;

public class CalculadorDeImc {
        /**
     * MENOR QUE 18,5       MAGREZA         0
     * ENTRE 18,5 E 24,9    NORMAL          0
     * ENTRE 25,0 E 29,9    SOBREPESO       I
     * ENTRE 30,0 E 39,9    OBESIDADE       II
     * MAIOR QUE 40,0       OBESIDADE GRAVE III
     */
    public Double calcula(final Pessoa pessoa) {
        final var altura = pessoa.getAltura();
        final var imc = pessoa.getPeso() / (altura * altura);


        return imc;
    }

    private static boolean verifica(Integer imc){
        if(imc<18.5){
            corpo = "MAGREZA ";
        }
        else if (imc >=18.5 && imc <=24.9) {
            corpo = "NORMAL ";
        }
        else if (imc >=25 && imc <29.9) {
            corpo = "SOBREPESO  ";
        }
        else if (imc >=30 && imc <39.9) {
            corpo = "OBESIDADE  ";
        }
        else {
            corpo = "OBESIDADE GRAVE ";
        }

    return corpo;
    }
}
