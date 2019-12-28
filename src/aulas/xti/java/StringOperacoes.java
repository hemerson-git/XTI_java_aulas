package aulas.xti.java;

public class StringOperacoes {
    public static void main(String[] args) {
        //formas literais de criar Strings
        String s1 = "Write Once";
        String s2 = s1 + " Run Anywhere";
        String s3 = new String ("Java Virtual Machine");
        
        //String via array de caracteres
        char[] array = {'J', 'a', 'v', 'a'};
        String s4 = new String(array);
        
        //OPERAÇOES COM STRINGS
        int tamanho = s1.length(); // retorna o tamanho da String
        int letra = s1.charAt(0); //retorna a letra que se encontra no indice
        String texto  = s1.toString(); //retorna a propria String
        
        //LOCALIZACAO
        int posicao = s3.indexOf("Virtual"); //retorna a posicao onde inicia a palavra
        int ultima = s3.lastIndexOf("ch"); //retorna a posicao da ultima aparicao do caractere
        boolean vazia = s1.isEmpty(); //verifica sse a string está vazia
        
        //COMPARAÇÂO
        String xti = "XTI";
        boolean x = xti.equals("xti"); //compara strings 
        boolean y = xti.equalsIgnoreCase("xti");// compara e ignora o case sensitive 
        //boolean z = xti.startsWith("TI"); //verifica se começa com o parametro passado
        boolean z = xti.endsWith("TI"); //verifica o fim da String
        
        int c = "amor".compareTo("bola");//-1 para string que vem antes e 1 para o contrario
                                         //0 para strings iguais
        
        String so = "Olhe, olhe";
        boolean d = so.regionMatches(6, "Olhe", 0, 4); //verifica se tem uma string
                                                       //detro da outra com case sensitive
        //EXTRSAÇAO
        String teste = "O Brasil é lindo";
        String t2 = teste.substring(11); //retorna a substring a partir da posicao 
        String t3 = teste.substring(2, 8); //retorna a substring do trecho
        
        //MODIFICAÇÂO
        t2 = t2.toUpperCase();//transforma a string em maiuscula
        t3 = t3.toLowerCase();//transforma a string em minuscula
        System.out.println("    espacos     ".trim());// remove os espacos
        
        System.out.println(t2 + " " + t3);
        
    }
}
