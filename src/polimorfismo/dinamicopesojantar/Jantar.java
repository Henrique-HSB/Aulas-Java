package polimorfismo.dinamicopesojantar;


public class Jantar {
    public static void main(String[] args) {
        polimorfismo.dinamicopesojantar.Pessoa convidado = new polimorfismo.dinamicopesojantar.Pessoa(99.65);
        polimorfismo.dinamicopesojantar.Arroz ingrediente1 = new polimorfismo.dinamicopesojantar.Arroz(0.25);
        polimorfismo.dinamicopesojantar.Feijao ingrediente2 = new polimorfismo.dinamicopesojantar.Feijao(0.180);
        System.out.println(convidado.getPeso());
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        System.out.println(convidado.getPeso());
        polimorfismo.dinamicopesojantar.Sorvete sobremesa = new polimorfismo.dinamicopesojantar.Sorvete(0.4);
        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

    }
}
