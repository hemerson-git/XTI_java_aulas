package aulas.xti.POO;

public class CarroTeste {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        ferrari.modelo = "Ferrari Enzo";
        ferrari.velocidadeMaxima = 349;
        ferrari.segundosZeroACem = 3.2;
        Motor v12 = new Motor();
        v12.tipo = "V12";
        v12.potencia = 660;
        ferrari.motor = v12;
        
        Carro koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
        Motor v8 = new Motor("V8", 1018);
        koenigsegg.motor = v8;
        
        Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2 , new Motor("W16" , 1200));
        
        System.out.println(bugatti.motor.potencia);
    }
}
