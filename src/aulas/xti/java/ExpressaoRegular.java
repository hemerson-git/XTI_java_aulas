package aulas.xti.java;
import java.util.Scanner;

public class ExpressaoRegular {
    
    static boolean verificarFormatoCPF(String cpf){
        boolean resultado = false;
        String padraoCPF = "\\d{3}.\\d{3}.\\d{3}-\\d{2}";
        if (cpf.matches(padraoCPF)){
            resultado = true;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        String cpf = "";
        
        while(continuar){
            System.out.print("Informe o seu CPF: ");
            cpf = teclado.next();
            continuar = !verificarFormatoCPF(cpf);
        }
        
        System.out.println(cpf);
    }
}
