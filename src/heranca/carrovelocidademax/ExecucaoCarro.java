package heranca.carrovelocidademax;


public class ExecucaoCarro {
    public static void main(String[] args) {

        heranca.carrovelocidademax.Carro c1 = new Civic();
        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);

        c1.acelerar();
        System.out.println(c1);




        heranca.carrovelocidademax.Carro c2 = new Ferrari();
        // Mesmo vc declarando o tipo mais genérico, o Java entende a partir da instância que o tipo é Ferrari

        c2.acelerar();
        System.out.println(c2);

        c2.frear();

        c2.acelerar();
        System.out.println(c2);

        c2.acelerar();
        System.out.println(c2);

    }
}

