import imc.CalculadorDeImc;
import pessoa.Pessoa;

public class Programa {

    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Henrique", 1.9, 80.0);

        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        String corpo;

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

        System.out.printf("%s O seu IMC  é = %.2f você tem o corpo %s", pessoa.getNome(),imc,corpo);
    }

}
