package aulas.xti.collection;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        //filas obedecem a regra FIFO
        fila.add("Hemerson");
        fila.add("Graziele");
        fila.offer("Marco Antonio");
        System.out.println(fila);
        
        System.out.println(fila.peek()); 
        System.out.println(fila.poll()); //removo o elemento do início da fila
        System.out.println(fila);
        
        /*Outros métodos disponíveis em LinkedList */
        LinkedList<String> f = (LinkedList) fila; 
        f.addFirst("Felipe"); //coloca no inicio da fila
        f.addLast("Carol"); //coloca no fim da fila
        System.out.println(f);
        
        System.out.println(f.peekFirst());
        System.out.println(f.peekLast());
        
        System.out.println(f.pollFirst());
        System.out.println(f.pollLast());
        
    }
}
