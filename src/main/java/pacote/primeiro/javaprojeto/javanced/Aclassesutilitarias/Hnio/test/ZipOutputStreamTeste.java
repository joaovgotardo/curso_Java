package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTeste {
    //Fluxo de Entrada e Saída Zip
    public static void main(String[] args) {
        Path oZip = Paths.get("arquivos/pasta.zip"); //Onde o arquivo ficará.
        Path paraZipar = Paths.get("arquivos/subarquivos/subsubarquivos");
        ObjetoZip(oZip, paraZipar);
    }
    private static void ObjetoZip(Path oZip, Path paraZipar){
        //Try with resources pois é closeable.
        try(ZipOutputStream zos = new ZipOutputStream(Files.newOutputStream(oZip));
            //Cria um zip do arquivo.
            DirectoryStream<Path> ds = Files.newDirectoryStream(paraZipar)){
            //Percorre os arquivos do diretório que serão zipados.
        for(Path file:ds){
            ZipEntry entrada = new ZipEntry(file.getFileName().toString()); //Etapa 1 - Preparar a entrada do Zip
            zos.putNextEntry(entrada); //Coloca o objeto que servirá de arquivo zip.
            Files.copy(file, zos); //Isso é feito para que o conteúdo também seja pego, e não só o arquivo.
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
