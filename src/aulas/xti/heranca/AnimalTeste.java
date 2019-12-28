package aulas.xti.heranca;

public class AnimalTeste {
    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        toto.comida = "Carne";
        toto.fazerBarulho();
        
        Galinha carijo = new Galinha();
        carijo.fazerBarulho();
        
    }
}
