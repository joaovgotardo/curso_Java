package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Gio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File, FileWriter (Escrita), FileReader (Leitura), BufferedWriter, BufferedReader
public class FileWriterTeste {
    public static void main(String[] args) {
        File file = new File ("file2.txt");
        //Escrita e leitura de arquivo trabalham com espaço do SO.
        try(FileWriter fw = new FileWriter(file, true)) { //*
            //É possível usar o filewriter no try with resources, pois
            //ele é closeable, pois é preciso .close() devido ao uso de recursos.
            fw.write("Esse é o texto, eu estou escrevendo dentro do arquivo");
            //Essa escrita funciona como um buffer: os dados entram aos poucos. Por isso,
            //é possível fechar o arquivo antes que tudo tenha entrado.
            fw.flush(); //Por isso o flush existe. Depois dele, o close é chamado.
            fw.write("\nOutra linha, essa é um teste de pular linhas. " +
                    "\n A linha foi pulada.");
            //*A cada execução, o arquivo deleta oq foi excluído. Para isso, o append
            //pode ser posto como true, e a cada execução, o que foi escrito antes permanece.
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
