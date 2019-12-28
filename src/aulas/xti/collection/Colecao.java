package aulas.xti.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecao {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("A");
        list.add("E");
        list.add("I");
        System.out.println(list.toString());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("A"));
        
        list.remove("A");
        System.out.println(list.toString());
        
        /* Grupos */
        Collection<String> c2 = Arrays.asList("O", "U");
        list.addAll(c2);
        System.out.println(list.toString());
        System.out.println(list.containsAll(c2));
        list.removeAll(c2);
        System.out.println(list.toString());
        
        /* Percorrer os elementos */
        for(String letra : list){
            System.out.println(letra);
        }
        
        String[] lista = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(lista));
        
        list.clear();
        System.out.println(list.toString());
    }
}
