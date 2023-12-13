package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamTeste {
    public static void main(String[] args) {
        //Funciona como o dir. É um objeto para iterar sobre as entradas de um diretório.
        Path path = Paths.get("myFolder_Again"); //Tudo o que há no diretório atual.
        //Generics - O que o Java decide em compilação, será o tipo de arquivo que ele criará.
        //Vai criar um Directory Stream (fluxo de diretório) de Path.
        try(DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            for (Path path1:stream) {
                System.out.println(path1.getFileName());
            }
            //Vai imprimir todos os arquivos, incluindo ocultos, da pasta selecionada.
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
