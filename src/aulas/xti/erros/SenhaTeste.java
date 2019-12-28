package aulas.xti.erros;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SenhaTeste {

    public static void verificar(int senha, int tentativas) throws SenhaInvalidaException {
        if (123 == senha) {
            //autenticado 
            System.out.println("Autenticado");
        } else {
            throw new SenhaInvalidaException("Senha Inválida! \n" + (tentativas - 1) + 
                                             " tentativas restantes!");
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //String pass = teclado.next();
        int tentativas = 3;

        do {
            try {

                System.out.print("Insira a senha: ");
                int pass = teclado.nextInt();
                verificar(pass, tentativas);

                tentativas = 0;
            } catch (SenhaInvalidaException e) {
                --tentativas;
                System.err.println(e.getMessage());
            }catch(InputMismatchException e2){
                --tentativas;
                System.err.println("A senha deve ser Númerica " + tentativas + 
                                    " Tentativas restantes! \n");
                teclado.nextLine();
            }
        } while (tentativas > 0);
    }
}
