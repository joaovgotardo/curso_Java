package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Gio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTeste {
    public static void main(String[] args) {
        //FileWriter e FileReader são arquivos de low-level.
        File file = new File ("file2.txt");
        try(FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw)) {
            //O bufferedWriter recebe como argumento um filewriter.
            //Só troca filewriter por bufferwriter.
            bw.write("Esse é o texto, eu estou escrevendo dentro do arquivo"); bw.newLine();
            bw.write("Outra linha, essa é um teste de pular linhas."); bw.newLine();
            bw.write("A linha foi pulada. Essa é a última linha do arquivo");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
