package heranca.carrovelocidade;

public class Ferrari extends Carro {
    @Override
    void acelerar() {
        super.acelerar();

        velocidadeAtual += 15;
    }
}
