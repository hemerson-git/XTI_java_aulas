package aulas.xti.java;

public class StringMutavel {
    public static void main(String[] args) {
        StringBuffer s0 =  new StringBuffer();
        StringBuilder s1 =  new StringBuilder("Java");
        
        s1.length();
        s1.toString();
        s1.capacity(); //retorna a capacidade do objeto sem alocar mais memoria
        
        //s1.reverse(); //retorna a String invertida
        
        s1.append(" Trabalhando ");
        char[] c = {'c', 'o', 'm'};
        s1.append(c).append(" Textos");
        System.out.println(s1);
        
        //Cria um stringBuilder, deleta da posicao 0 à 4 e transforma em String
        String url = new StringBuilder("www.xti.com.br").delete(0, 4).toString();
        System.out.println(url);
    }
}
