package aulas.xti.java;

import aulas.xti.POO.NewConta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo3 {

    static void escreverContas(ArrayList<NewConta> contas, Path path, Charset charset) {
        try (BufferedWriter text = Files.newBufferedWriter(path, charset)) {
            for (NewConta conta : contas) {
                text.write(conta.getName() + "-");
                text.write(Double.toString(conta.getSaldo()) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static ArrayList<NewConta> lerContas(Path path, Charset charset) {
        ArrayList<NewConta> contas = new ArrayList<>();
        String line = null;
        try (BufferedReader reader = Files.newBufferedReader(path, charset)) {
            while ((line = reader.readLine()) != null) {
                String[] conta = line.split("-");
                NewConta c = new NewConta(conta[0], Double.parseDouble(conta[1]));
                contas.add(c);
            }

        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return contas;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<NewConta> contas = new ArrayList<>();
        Path path = Paths.get("C:/aulas/xti/files/contas.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        
        
        System.out.print("Informe o seu nome: ");
        String user = teclado.nextLine();
        contas = lerContas(path, utf8);
        
        contas.add(new NewConta(user, 10_000.00));
        contas.add(new NewConta("Izabela", 20_000.00));
        contas.add(new NewConta("Graziele", 15_000.00));
        
        escreverContas(contas, path, utf8);

    }
}
