package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Gio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FileTeste {
    public static void main(String[] args) {
        File file = new File("file.txt");
        //Se esse método for executado, não acontece nada; apenas o objeto foi criado.
        try{
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
            //Existem métodos de getPath:
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isDirectory()); //Retorna se é uma pasta ou não.
            System.out.println(Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            boolean delete = file.delete();
            System.out.println(delete);
//            if(!file.exists()){
//                boolean newFile1 = file.createNewFile();
//                System.out.println(newFile1);
//            }
        }catch (IOException e){
            e.printStackTrace();
        }
        //O arquivo foi criado fora do src, na pasta base do Java.
         //O arquivo é deletado.
    }
}
