package aulas.xti.java;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class Arquivo4 {
    public static void main(String[] args) throws IOException{
        Path path = Paths.get("C:/aulas/xti/files/texto3.txt");
        Files.write(path, "teste".getBytes());
        System.out.println(Files.exists(path));
        System.out.println(Files.isDirectory(path));
        System.out.println(Files.isRegularFile(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.size(path));
        System.out.println(Files.getLastModifiedTime(path));
        System.out.println(Files.getOwner(path));
        System.out.println(Files.probeContentType(path));
        
        //DELETE
        Path delete = Paths.get("C:/aulas/xti/files/texto2.txt");
        Files.write(delete, "delete".getBytes());
        Files.delete(delete); //tenta delatar caso não consiga lança exceções
        Files.deleteIfExists(delete); //deleta se existir mas não lanca exceções
        
        //CRIAÇAO
        Path c = Paths.get("C:/aulas/xti/files/move");
        Files.createDirectories(c);
        
        //COPIA
        Path copia = Paths.get("C:/aulas/xti/files/copia.txt");
        Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
        
        //MOVER
        Path move = Paths.get("C:/aulas/xti/files/move/texto3.txt");
        Files.move(path, move, StandardCopyOption.REPLACE_EXISTING);
    }
}
