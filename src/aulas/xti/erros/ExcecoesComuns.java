package aulas.xti.erros;

import aulas.xti.heranca.Animal;
import aulas.xti.heranca.Cachorro;
import aulas.xti.heranca.Galinha;

public class ExcecoesComuns {
    static int[] arrayNull;
    static int[] array = new int[0];
    
    public static void main(String[] args) {
        //apontar objeto vazio NullPointerException
        //System.out.println(arrayNull.length);
        
        //divisão por zero ArithmeticException
        //System.out.println(1/0);
        
        //Acessar posição inexistente de um Array ArrayIndexOutOfBoundsException
        //System.out.println(array[1]);
        
        //a galinha não e um cachorro logo o casting é invalido ClassCastException
        //Animal a = new Galinha();
        //Cachorro c = (Cachorro) a;
        
        //Conversão impossivel de string em numero NumberFormatException
//        int inteiro = Integer.parseInt("xti");
//        System.out.println(inteiro);
        
    }
}
