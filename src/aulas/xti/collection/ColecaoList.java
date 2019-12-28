package aulas.xti.collection;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Futebol");
        lista.add("Basquete");
        lista.add("Tênis");
        lista.add("Volei");
        lista.add("Natação");
        lista.add("Hockey");
        lista.add("Boxe");
        lista.add("Futebol");
        System.out.println(lista);
        
        for(int i = 0; i < lista.size(); i++){
            String esporte = lista.get(i);
            lista.set(i, esporte.toUpperCase());
        }
        System.out.println(lista);
        System.out.println(lista.indexOf("BOXE"));
        System.out.println(lista.subList(2,4));
        lista.subList(2, 4).clear();
        System.out.println(lista);
        
        
    }
}
