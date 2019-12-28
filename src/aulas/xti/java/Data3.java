package aulas.xti.java;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Data3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(1997, Calendar.JANUARY, 06);
        Date data  = c.getTime();
        
        Locale padrao = Locale.getDefault(); //recupera a localização do sistema
        Locale brasil = new Locale("pt", "BR"); //localização do Brasil
        Locale india = new Locale("hi", "IN"); //india
        
        Locale usa = Locale.US;
        Locale japan = Locale.JAPAN;
        Locale italia = Locale.ITALY;
        
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(data));
        df = DateFormat.getDateInstance(DateFormat.FULL, brasil); //Brasil
        System.out.println(df.format(data));
        df = DateFormat.getDateInstance(DateFormat.FULL,india); //India
        System.out.println(df.format(data));
        df = DateFormat.getDateInstance(DateFormat.FULL,usa); //Estados Unidos
        System.out.println(df.format(data));
        df = DateFormat.getDateInstance(DateFormat.FULL,japan); //Japão
        System.out.println(df.format(data));
        df = DateFormat.getDateInstance(DateFormat.FULL,italia); //Italia
        System.out.println(df.format(data));
        
    }
}
