package heranca.carrovelocidademax;

public class Ferrari extends heranca.carrovelocidademax.Carro {

    Ferrari() {
        this(315);
    }

    Ferrari(int velocidadeMaxima) {
        super(velocidadeMaxima);
        delta = 110;
    }
}

