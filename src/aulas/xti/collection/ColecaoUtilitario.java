package aulas.xti.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Guaraná");
        lista.add("Uva");
        lista.add("Manga");
        lista.add("Coco");
        lista.add("Açaí");
        lista.add("Banana");
        System.out.println(lista);
        
        Collections.sort(lista);
        System.out.println(lista);
        
        Collections.reverse(lista);
        System.out.println(lista);
        
        Collections.shuffle(lista);
        System.out.println(lista);
        
        Collections.addAll(lista, "Cupuaçu", "Laranja", "Laranja");
        System.out.println(lista);
        
        System.out.println(Collections.frequency(lista, "Laranja"));
        
        List<String> lista2 = Arrays.asList("Acerola", "Graviola");
        boolean b = Collections.disjoint(lista, lista2);
        System.out.println(b);
        
        Collections.sort(lista);
        System.out.println(Collections.binarySearch(lista, "Guaraná"));
        
        Collections.fill(lista, "Açaí");
        System.out.println(lista);
        
        //Coleção não modificavel
        Collection<String> constante = Collections.unmodifiableCollection(lista);
        
        
        
    }
}
