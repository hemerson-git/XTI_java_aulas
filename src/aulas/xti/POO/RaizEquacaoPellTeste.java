package aulas.xti.POO;
import java.util.Scanner;

/**
 *
 * @author hemer
 */
public class RaizEquacaoPellTeste {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o numero: ");
        int numero = teclado.nextInt();
        RaizEquacaoPell raiz = new RaizEquacaoPell();
        System.out.println(raiz.raizPell(numero));
    }
}
