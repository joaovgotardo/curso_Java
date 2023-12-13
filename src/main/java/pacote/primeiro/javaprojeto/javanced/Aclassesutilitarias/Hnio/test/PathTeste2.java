package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTeste2 {
    public static void main(String[] args) throws IOException {
        Path pasta = Paths.get("pasta"); //new file()
        //Se o arquivo for executado mais de uma vez, uma exceção será lançada.
        //Um files.notExists previne que isso aconteça.
        if(Files.notExists(pasta)){
            Files.createDirectory(pasta);
        }
        //Para criar múltiplas pastas ao mesmo tempo, é usado o createDirectories.
        Path subpastas = Paths.get("pasta/subpasta/subpasta/subpasta");
        Files.createDirectories(subpastas); //Não lança exceção se o diretório já existe.
        //Também pode-se criar apenas uma pasta com ele.

        //Para criar um arquivo: Um dos métodos é pegar o diretório, torná-lo String e passar o arquivo pelo varargs.
        Path arquivo = Paths.get(subpastas.toString(), "arquivo.txt");
        if(Files.notExists(arquivo)){
            Files.createFile(arquivo); //Também retorna exceção se existir.
        }

        //Para renomear um arquivo:
        Path source = arquivo; //A fonte de onde vem o arquivo. Não é necessário existir.
        Path target = Paths.get(arquivo.getParent().toString(), "arquivo_renomeado.txt");
        //Se o .getParent() não for usado,  subpastas retornará até o arquivo.txt. Por isso ele
        //é necessário.
        Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        //Esse último valor serve para evitar uma exceção de arquivo já existente.
    }
}
