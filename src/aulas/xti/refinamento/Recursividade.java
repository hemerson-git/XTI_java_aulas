package aulas.xti.refinamento;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {
    public static int soma(int x){
        if(x == 0){
            return x;
        } else {
            System.out.println(x);
            return x + (soma(x - 1));
        }
    }
    
    public static int potencia(int base, int expo){
        switch (expo) {
            case 0:
                return 1;
            case 1:
                return base;
            default:
                return base * potencia(base, expo - 1);
        }
    }
    
    public static void listar(Path path){
        if(Files.isRegularFile(path)){
            System.out.println(path.toAbsolutePath());
        }else{
            System.out.println(path.toAbsolutePath());
            try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)){
                for (Path p : stream) {
                    listar(p);
                }
            }catch(Exception e){
                
            }
        }
    }
    
    public static void main(String[] args) {
        listar(Paths.get("C:/aulas/xti"));
    }
}
