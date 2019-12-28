package aulas.xti.java;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {
    
    static String verificaArmazenamento(long espaco){
        String armazenamento = null;
        if (espaco <= 1024){
            armazenamento = espaco + "Bytes";
        }
        else if (espaco > 1024 && espaco <= 1048_576){
            armazenamento = espaco/1024 + "KB";
        }
        else if (espaco > 1048_576 && espaco <= 1073_741_824){
            armazenamento = espaco/1048_576 + "MB";
        }else{
            armazenamento = espaco/1073_741_824 + "GB";
        }
        
        return armazenamento;
    }
    
    public static void main(String[] args) {
        //pega os diretorios raiz
        System.out.println("Raizes");
        Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
        for (Path path : dirs) {
            System.out.println(path.getRoot());
        }
        
        //Listagem de Arquivos
        System.out.println("Arquivos");
        Path caminho = Paths.get("C:/aulas/xti/files");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(caminho)) {
            for (Path path : stream) {
                System.out.println(path.getFileName());
            }
        } catch (IOException | DirectoryIteratorException e) {
            e.printStackTrace();
        }
        
        //Listar Partições
        FileSystem fs = FileSystems.getDefault();
        try{
            for(FileStore store : fs.getFileStores()){
                System.out.println("Unidade: " + store.toString());
                System.out.println("Capacidade: " + verificaArmazenamento(store.getTotalSpace()));
                System.out.println("Disponivel: " + verificaArmazenamento(store.getUsableSpace()));
            } 
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
