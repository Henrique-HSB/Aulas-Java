import imc.CalculadorDeImc;
import pessoa.Pessoa;

public class Programa {

    public static void main(String[] args) {
        final Pessoa pessoa = new Pessoa("Henrique", 1.9, 100.00);

        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("%s O seu IMC  é = %.2f", pessoa.getNome(),imc);
    }

}
