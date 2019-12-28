package aulas.xti.refinamento;

import java.util.ArrayList;
import java.util.List;

public class Garbage {
    public static long carregarMemoria(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            list.add(i);
        }
        return Runtime.getRuntime().freeMemory();
    }
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        final int MB = 1_048_576; //total de bytes em 1MB
        double total = rt.maxMemory()/MB; 
        
        double inicio = total - (carregarMemoria()/MB);
        
        rt.runFinalization();
        rt.gc();
        
        double fim = total - (rt.freeMemory()/MB);
        
        System.out.println("Total: " + total + "MB"); //total reservado pela JVM
        System.out.println("Início: " + inicio + "MB"); //Inicio após a sobrecarga
        System.out.println("Fim: " + fim + "MB"); //após a limpeza no sistema
    }
}
