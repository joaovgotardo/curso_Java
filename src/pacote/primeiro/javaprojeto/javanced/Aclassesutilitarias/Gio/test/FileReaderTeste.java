package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Gio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTeste {
    public static void main(String[] args) {
        File file = new File("file2.txt");
        try(FileReader fr = new FileReader(file)){
            System.out.println(fr.read());
            //Retorna o ASCII do primeiro caracter do arquivo.
            //Para ler o arquivo, pode-se usar um array.
//            char[] ch = new char[30];
//            fr.read(ch);
//            for (char c:ch) {
//                System.out.print(c);
//            }
            int i; //-1 é o valor final do read.
            while ((i=fr.read()) != -1){
                System.out.print((char)i); //É feito então um cast, para que sejam impressos os caracteres.
            }
            //Pode também ser feito um int com o filereader.read(), q retorna o n de caracteres.
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
