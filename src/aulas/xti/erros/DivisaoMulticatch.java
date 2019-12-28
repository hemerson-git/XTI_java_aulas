package aulas.xti.erros;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisaoMulticatch {

    public static void dividir(Scanner s)
            throws ArithmeticException, InputMismatchException {
        System.out.print("Informe o valor do dividendo: ");
        float dividendo = s.nextFloat();
        System.out.print("Informe o valor do divisor: ");
        float divisor = s.nextFloat();
        System.out.println("Resultado: " + dividendo / divisor);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        do {
            try {
                dividir(teclado);
                continuar = false;
            } //com essa estrutura de multicatch é possivel tratar varias exceções
            //em um bloco
            catch (InputMismatchException | ArithmeticException excecao1) {
                System.err.println("Número Invalido! \n");
                teclado.nextLine(); //descarta a entrada que deu erro e libera para o usuario
            } finally {
                System.out.println("Finelly executado! ");
            }

        } while (continuar);
    }
}
