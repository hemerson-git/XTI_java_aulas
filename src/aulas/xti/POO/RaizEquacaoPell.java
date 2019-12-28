/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas.xti.POO;

/**
 *
 * @author hemer
 */
public class RaizEquacaoPell{
    int numero;
    
    int raizPell(int numero){
        int impar = 1, raiz = 0;
        
        while(numero >= impar){
            numero -= impar;
            impar += 2;
            raiz++;
        }
        return raiz;
    }
}
