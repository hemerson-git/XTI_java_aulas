package aulas.xti.java;

import aulas.xti.POO.NewConta;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Serializa2 {

    static void escreverContas(String path, ArrayList<NewConta> contas) {
        try (FileOutputStream fos = new FileOutputStream(path)) {
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(contas);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static ArrayList<NewConta> lerContas(String path) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (FileInputStream fis = new FileInputStream(path)) {
            try (ObjectInputStream ois = new ObjectInputStream(fis)) {
                return (ArrayList<NewConta>) ois.readObject();
            }
        }
    }
    
    static void limparListaContas(Path path){
        try{
           Files.delete(path);
        }catch(IOException e1){
            System.out.println("Arquivo não encontrado");
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner teclado = new Scanner(System.in);
        ArrayList<NewConta> contas = new ArrayList<>();
        String path = "C:/aulas/xti/files/contas.ser";
        Path caminho = Paths.get(path);

        if (Files.exists(caminho)) {
            contas.addAll(lerContas(path));
        } else {
            contas.add(new NewConta("Izabela", 20_000.00));
            contas.add(new NewConta("Graziele", 15_000.00));
        }

        System.out.print("Informe o seu nome: ");
        String user = teclado.nextLine();

        contas.add(new NewConta(user, 10_000.00));

        escreverContas(path, contas);

        for (NewConta conta : contas) {
            System.out.println(conta.getName() + " " + conta.getSaldo());
        }

    }
}
