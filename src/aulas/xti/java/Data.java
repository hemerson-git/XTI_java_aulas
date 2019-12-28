package aulas.xti.java;

import java.util.Calendar;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
        /* Imprime o tempo atual em milissegundos a partir de 01/01/1970 */
        System.out.println(System.currentTimeMillis());
        
        /* Criando e manipulando datas */
        Date agora = new Date();
        Date data = new Date(1_000_000_000_000L);
        
        /* Métodos */
        data.getTime();
        data.setTime(1_000_000_000_000L);
        System.out.println(data.compareTo(agora)); //-1, 0, 1
        
        /* Gregorian Calendar */
        Calendar c = Calendar.getInstance();
        c.set(1997, Calendar.JANUARY, 01);
        System.out.println(c.getTime());
        
        System.out.println(c.get(Calendar.YEAR)); //ano
        System.out.println(c.get(Calendar.MONTH)); // mês
        System.out.println(c.get(Calendar.DAY_OF_MONTH)); //dia
        
        c.set(Calendar.YEAR, 2019);
        System.out.println(c.getTime());
        
        //limpar
        c.clear(Calendar.MINUTE); //limpa o campo de minutos
        c.clear(Calendar.SECOND);
        System.out.println(c.getTime());
        
        //adicionando 
        c.add(Calendar.MONTH, 1); //adiciona 1 ao mês
        System.out.println(c.get(Calendar.MONTH));
        
        c.roll(Calendar.MONTH, 1); //adiciona ao mês porém sem alterar outros campos
        System.out.println(c.get(Calendar.MONTH));
        
        /* Saudação bom dia, boa tarde, boa noite */
        Calendar c1 = Calendar.getInstance();
        Date d1 = c1.getTime();
        c1.set(Calendar.HOUR_OF_DAY, 17);
        int hora = c1.get(Calendar.HOUR_OF_DAY ); 
        
        if(hora >= 12 && hora <18 ){
            System.out.println("Boa Tarde!");
        } else if(hora >= 18){
            System.out.println("Boa Noite!");
        }else{
            System.out.println("Bom Dia!");
        }
    }
}
