package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Gio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTeste {
    public static void main(String[] args) {
        File file = new File("file2.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){ //De maneira similar ao bw.
            String s; //O Buffered lê através do readLine.
            while ((s=br.readLine()) != null){
                System.out.println(s);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
