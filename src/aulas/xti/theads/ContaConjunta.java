package aulas.xti.theads;

public class ContaConjunta {
    private int saldo = 100;
    
    public int getSaldo(){
        return saldo;
    }
    
    public synchronized void sacar(int valor, String cliente){
        if(valor <= saldo){
            int saldoOriginal = saldo;
            System.out.println(cliente + " Vai sacar");
            try{
                System.out.println(cliente + " Esperando processamento.");
                Thread.sleep(1000);//aguardando processamento
            } catch(InterruptedException e){}
            saldo -= valor;
            System.out.print(cliente + " SACOU " + valor);
            System.out.println("[Saldo Original= " + saldoOriginal + "]" );
            System.out.println("[Saldo final= " + saldo + "]");
        }else{
            System.out.println("Saldo Insuficiente para sacar!");
        }
    } 
}
