package aulas.xti.refinamento;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws Exception {
        
        String nome = "aulas.xti.POO.NewConta";
        Class classe = Class.forName(nome);
        System.out.println(classe.getSimpleName());
        
        Field[] f = classe.getFields();
        for (Field field : f) {
            System.out.println(field);
        }
        
        Method[] m = classe.getDeclaredMethods();
        for (Method method : m) {
            System.out.println(method.getName());
        }
        
        Constructor[] c = classe.getConstructors();
        for (Constructor constructor : c) {
            System.out.println(constructor);
        }
        
        Object o = classe.newInstance();
        Method md = classe.getMethod("deposita", double.class);
        Method me = classe.getMethod("exibeSaldo");
        md.invoke(o, 120);
        me.invoke(o);
        
        Constructor co = classe.getConstructor(String.class, double.class);
        Object obj = co.newInstance("Hemerson", 123_456.456);
        me.invoke(obj);
    }
}
