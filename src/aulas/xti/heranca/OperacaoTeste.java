package aulas.xti.heranca;

public class OperacaoTeste {
    public static void calcule(OperacoesMatematicas o , double x, double y){
        System.out.println(o.calcular(x, y));
    }
    
    public static void main(String[] args) {
        calcule(new Soma(), 5,5);
        calcule(new Multiplicacao(), 5,5);
    }
}
