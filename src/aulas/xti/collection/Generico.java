package aulas.xti.collection;

import java.util.ArrayList;

public class Generico <E> {
    
    E elemento;
    
    public void setElement(E elemento){
        this.elemento = elemento;
    }
    
    public E getElement(){
        return elemento;
    }
    
    public double soma (ArrayList<? extends Number> list){
        double total = 0;
        for (Number number : list) {
            total += number.doubleValue();
        }
        
        return total;
    }
    
    public static void main(String[] args) {
        
        Generico<String> g = new Generico();
        g.setElement("Lago Paranoá");
        //g.setElement
        g.getElement().toUpperCase();
    }
}
