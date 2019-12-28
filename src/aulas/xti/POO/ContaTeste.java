package aulas.xti.POO;
import java.util.Scanner;
/**
 *
 * @author hemer
 */
public class ContaTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String user = teclado.next();
        
        //Conta 1 -- A do usuario
        Conta c1 = new Conta(user, 10_000.00, 123456);
        c1.addConta();
        
        //conta 2 - para deposito
        Conta c2 = new Conta("Graziele", 17_000, 123456789);
        c2.addConta();
        
        //conta 3 
        Conta c3 = new Conta("Izabela", 15_000, 852369);
        c3.addConta();
        
        c1.transferePara(c2);
        c2.getSaldo();
    }
}
