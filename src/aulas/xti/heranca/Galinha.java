package aulas.xti.heranca;

public class Galinha extends Animal{
    @Override
    /**
     *sobrescreve o metodo padrão de fazer barulho da SuperClasse Animal
     */
    public void fazerBarulho(){
        System.out.println("Có, Có!");
    }
}
