package pacote.primeiro.javaprojeto.javanced.Aclassesutilitarias.Hnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTeste {
    public static void main(String[] args) throws IOException {
        //Permite usar polimorfismo a partir do SO.
        //BasicFileAttributes
        //DosFileAttributes - Windows
        //PosixFileAttributes - Linux
        LocalDateTime date = LocalDateTime.now().minusDays(20);
        File file = new File("myFolder_Again/file3.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli()));

        Path path = Paths.get("myFolder_Again/path.txt");
        FileTime ft = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.createFile(path);
        Files.setLastModifiedTime(path, ft);
        //O segundo arquivo requerido é um FileTime, que deve ser criado.
        System.out.println(Files.isExecutable(path));
        System.out.println(Files.isHidden(path));
        System.out.println(Files.isWritable(path));
    }
}
