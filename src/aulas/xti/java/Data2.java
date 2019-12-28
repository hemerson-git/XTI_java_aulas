package aulas.xti.java;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data2 {
    public static void main(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        c.set(1997, Calendar.JANUARY, 06);
        Date date = c.getTime();
        
        /* Formatação de datas */
        System.out.println(date); //formatação padrão da classe date
        DateFormat df = DateFormat.getDateInstance();
        System.out.println("DateInstance " + df.format(date));//recebe uma data e retorna uma String
        
        /* Formatação de hora */
        df = DateFormat.getTimeInstance();
        System.out.println("TimeInstance " + df.format(date));//retorna a hora formatada
        
        /* Formatação de data e hora */
        df = DateFormat.getDateTimeInstance();
        System.out.println("DateTimeInstance " + df.format(date));//retorna a data e hora formatada
        
        
        /* ESTILIZAÇÃO */
        df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("completa " + df.format(date));//estilo completo, versão brasileira
        df = DateFormat.getDateInstance(DateFormat.LONG);
        System.out.println("longa " + df.format(date));//estilo longo, sem deia da semana
        df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("medio " + df.format(date));//estilo Medio, dd/mm/aaaa
        df = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println("curta " + df.format(date));//estilo curto, dd/mm/aa
        
        /* CONVERSÃO */
        Date data2 = df.parse("01/05/1998"); //transforma a string em data
        
        /* SimpleDateFormat */
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(date));
        System.out.println(sdf.parse("10/10/2010"));
        
        
    }
}
