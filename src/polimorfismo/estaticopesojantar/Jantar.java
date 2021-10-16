package polimorfismo.estaticopesojantar;


public class Jantar {
    public static void main(String[] args) {
        polimorfismo.estaticopesojantar.Pessoa convidado = new polimorfismo.estaticopesojantar.Pessoa(99.65);
        Arroz ingrediente1 = new Arroz(0.25);
        polimorfismo.estaticopesojantar.Feijao ingrediente2 = new polimorfismo.estaticopesojantar.Feijao(0.180);
        System.out.println(convidado.getPeso());
        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);
        System.out.println(convidado.getPeso());
        polimorfismo.estaticopesojantar.Sorvete sobremesa = new polimorfismo.estaticopesojantar.Sorvete(0.4);
        convidado.comer(sobremesa);
        System.out.println(convidado.getPeso());

}
}
