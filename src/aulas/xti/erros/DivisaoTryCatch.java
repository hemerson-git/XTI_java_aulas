package aulas.xti.erros;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisaoTryCatch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        
        do{
            try{
                System.out.print("Informe o valor do dividendo: ");
                int dividendo = teclado.nextInt();
                System.out.print("Informe o valor do divisor: ");
                int divisor = teclado.nextInt();
                System.out.println("Resultado: " + dividendo / divisor);
                continuar = false;
            }
            catch(InputMismatchException excecao1){
                System.err.println("Os números devem ser inteiros! \n");
                teclado.nextLine(); //descarta a entrada que deu erro e libera para o usuario
            }
            catch(ArithmeticException excecao2){
                System.err.println("Divisor deve ser diferente de 0 \n");
                teclado.nextLine();
            }
            finally{
                System.out.println("Finelly executado! ");
            }
            
        }while(continuar);
    }
}
