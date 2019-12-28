package aulas.xti.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

    public static void main(String[] args) throws IOException {
        Path caminho = Paths.get("C:/aulas/xti/files/texto3.txt");
        Scanner teclado = new Scanner(System.in);
        Charset utf8 = StandardCharsets.UTF_8;
        
        /* ESCRITA */
        //inicio da ligação
        try (BufferedWriter text = Files.newBufferedWriter(caminho, utf8)) {
            System.out.print("Informe a sua senha: ");
            text.write("senha:" + teclado.next() + "\n");
            text.write(teclado.next());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        /* LEITURA */
        try(BufferedReader reader = Files.newBufferedReader(caminho, utf8)){
            String line = null;
            //lê linha a linha do arquivo
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e2){
            e2.printStackTrace();
        }
    }
}
