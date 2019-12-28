package aulas.xti.java;

import aulas.xti.POO.NewConta;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializa {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        NewConta conta1 = new NewConta("Hemerson", 15_000);
        
        //ESCRITA DE OBJETO
        FileOutputStream fos = new FileOutputStream("C:/aulas/xti/files/serializado.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(conta1);
        oos.close();
        
        //LEITURA DE OBJETO
        FileInputStream fis = new FileInputStream("C:/aulas/xti/files/serializado.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        NewConta conta = (NewConta)ois.readObject();
        ois.close();
        System.out.println(conta.getName() + conta.getSaldo());
    }
}
