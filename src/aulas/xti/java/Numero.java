package aulas.xti.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Numero {
    public static void main(String[] args) throws ParseException {
        double saldo = 123_456.789;
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.format(saldo));
        
        //inteiros
        nf = NumberFormat.getIntegerInstance();
        System.out.println(nf.format(saldo));
        
        //percentual
        nf = NumberFormat.getPercentInstance();
        System.out.println(nf.format(0.25));
        
        //moeda
        nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.format(saldo));
        
        //número maximo de casas decimais
        nf.setMaximumFractionDigits(1);
        System.out.println(nf.format(saldo));
        
        /* Internacionalização */
        Locale usa = Locale.US;
        Locale japan = Locale.JAPAN;
        Locale france = Locale.FRANCE;
        
        nf = NumberFormat.getCurrencyInstance(usa); //formata com o padrão americano
        System.out.println(nf.format(saldo));  
        nf = NumberFormat.getCurrencyInstance(japan); //formata com o padrão japonês
        System.out.println(nf.format(saldo));  
        nf = NumberFormat.getCurrencyInstance(france); //formata com o padrão Francês
        System.out.println(nf.format(saldo)); 
        
        /* Conversão com o parse */
        nf = NumberFormat.getCurrencyInstance();
        System.out.println(nf.parse("R$ 1.540,50"));
    }
}
