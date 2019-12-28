package aulas.xti.erros;

import java.util.Scanner;

public class Assertion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira um valor entre 1 e 10");
        int num = teclado.nextInt();
        
        //por padrão as assertions vêm desligadas
        
        assert(num >= 1 || num <= 10) : "Número fora do renge";
        
        System.out.println("Você entrou com "+ num);
    }
}
