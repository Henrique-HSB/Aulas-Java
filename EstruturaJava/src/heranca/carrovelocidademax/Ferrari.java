package heranca.carrovelocidademax;

public class Ferrari extends Carro {

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 110;
    }
}

